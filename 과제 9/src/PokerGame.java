import java.util.Random;

public class PokerGame {
    private int cnt;
    private Cards getCard, getCard2;
    private Cards[][] fiveCards = new Cards[10][10];//[n][m]:n번째 사람에게 m의 카드를 준다. m==5개
    public static String[] plyerNames = new String[10];
    public static int plyerNumber;


    public void GamePlay()
    {
        DeckOfCards newCard = new DeckOfCards();
        newCard.shuffle();
        int maxVal=-1;
        for(int i=0;i<plyerNumber;i++)
        {
            for(int j=0;j<5;j++) {
                getCard = newCard.dealCard();
                fiveCards[i][j] = new Cards(getCard.getSuit(), getCard.getFace());
            }
        }
        printGameStatus();
    }

    public void printGameStatus()
    {//현재 게임 상황을 출력합니다. 카드 순서: 내림차순  ex)홍길동: H1, H2, H3, H4, H5
        System.out.println("↓↓↓↓↓↓↓↓↓↓이부분 보시면 GUI감이 오실거에요~~↓↓↓↓↓↓↓↓↓↓");
        for(int i=0; i<plyerNumber; i++)
        {//i번째 플레이어
            CardSort(i);
            System.out.printf("%s: ", plyerNames[i]);
            for(int j=0;j<5;j++)
            {//i번쨰 플레이어가 가지고 있는 카드 5장.
                if(j<4) System.out.printf(fiveCards[i][j].toString()+", ");
                else System.out.printf(fiveCards[i][j].toString()+"");
            }
            System.out.printf("\nResult: %s", rankMyHand(i));
            System.out.printf("\n");
        }
        System.out.println("↑↑↑↑↑↑↑↑↑↑이부분 보시면 GUI감이 오실거에요~~↑↑↑↑↑↑↑↑↑↑");

    }

    public void CardSort(int sortNthPlayerCard)
    {//랭크의 크기는 C<H<D<S라고 가정.
        Cards[] sortMyDeck = new Cards[5];
        sortMyDeck = fiveCards[sortNthPlayerCard];
        for(int i=0; i<5; i++)
        {//버블정렬. 내림차순으로
            for(int j=0; j<5-(i+1); j++)
            {
                int tempForRank1=0, tempForRank2=0;
                tempForRank1 = suitToint(sortMyDeck[j]);
                tempForRank2 = suitToint(sortMyDeck[j+1]);
                if(tempForRank1<tempForRank2)
                {
                    Cards temp = new Cards(sortMyDeck[j+1].getSuit(), sortMyDeck[j+1].getFace());
                    sortMyDeck[j+1] = sortMyDeck[j];
                    sortMyDeck[j] = temp;
                }
            }
        }
    }

    public int suitToint(Cards card)
    {//S==10, D==20, H==30, C==40으로 생각하여 카드의 대소를 정수 형식으로 비교할 수 있다.
        int rank=0;
        if(card.getSuit()=="C") rank+=10;
        else if(card.getSuit()=="H") rank+=20;
        else if(card.getSuit()=="D") rank+=30;
        else if(card.getSuit()=="S") rank+=40;
        rank += card.getFace();
        return rank;
    }

    private String rankMyHand(int rankNthPlayer)
    {
        Cards[] rankMyDeck = new Cards[5];
        rankMyDeck = fiveCards[rankNthPlayer];//rankNthPlayer의 덱을 rankMyDeck에 저장하여 평가합니다.
        boolean straight=false, royal=false, flush=true, trips=false, quads=false;//족보 확인용 변수 모음.
        int numPair=0;

        //스트레이트 확인
        int straightCounter=0;
        for(int i=1; i<5;i++)
        {
            if(rankMyDeck[i].getFace()==rankMyDeck[i-1].getFace()-1) ++straightCounter;
        }
        if(straightCounter==4)
        {//straight이고, 0번째 Face가 A이면 로얄
            straight=true;
            if(rankMyDeck[0].getFace()==14) royal = true;
        }
        else if (straightCounter==3 && rankMyDeck[0].getFace()==14 && rankMyDeck[1].getFace()==5)
        {//A 2 3 4 5 스트레이트
            straight = true;
        }

        //플러쉬 확인
        for(int i=1; i<5;i++)
        {
            if(rankMyDeck[i].getSuit()!=rankMyDeck[i-1].getSuit())
            {
                flush=false;
            }
        }

        //같은 숫자 & Trip확인
        int[] pairRecognizeField = new int[15];
        for(int i=0;i<5;i++)
        {
            if(pairRecognizeField[rankMyDeck[i].getFace()] == 0)
            {
                for (int j = i + 1; j < 5; j++)
                {
                    if (rankMyDeck[i].getFace() == rankMyDeck[j].getFace())
                    {//해당 Face의 칸을 +1해줌으로써 어떤 Face가 몇개 나왔는지 알 수 있습니다.
                        pairRecognizeField[rankMyDeck[i].getFace()] += 1;
                    }
                }
            }
        }
        for(int i=1;i<=14;i++)
        {//pairRecognizeField검사하는 부분입니다.
            if(pairRecognizeField[i]==1) numPair++;
            if(pairRecognizeField[i]==2) trips=true;
            if(pairRecognizeField[i]==3) quads=true;
        }

        //결과 반환
        String result = new String();
        if(royal && flush) result="Royal Flush";
        else if(straight && flush) result = "Straight Flush";
        else if(quads) result="Quads";
        else if(trips && numPair==1) result="FullHouse";
        else if(flush) result = "Flush";
        else if(straight) result = "Straight";
        else if(trips) result = "Trips";
        else if(numPair==2) result = "Two Pair";
        else if(numPair==1) result = "One Pair";
        else result = "High Score) " + rankMyDeck[0].toString();

        return result;
    }
}


