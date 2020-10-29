import java.util.Random;

public class OnePairCard {
    private int cnt;
    private Cards getCard, getCard2;
    private Cards[] fiveCards = new Cards[10];

    OnePairCard(int usrCnt)
    {
        cnt = usrCnt;
    }

    public void GamePlay()
    {
        DeckOfCards newCard = new DeckOfCards();
        newCard.shuffle();
        int maxVal=-1;
        System.out.printf("게임 %d: (", cnt);
        for(int i=0;i<5;i++)
        {
            getCard = newCard.dealCard();
            fiveCards[i]=new Cards(getCard.getSuit(),getCard.getFace());
            if(i<4) System.out.printf(fiveCards[i].toString()+", ");
            else System.out.printf(fiveCards[i].toString()+")");
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                getCard=fiveCards[i];
                getCard2=fiveCards[j];
                 if ((getCard.getFace() == getCard2.getFace() && maxVal < getCard.getFace())) {
                    maxVal = getCard.getFace();
                }
            }
        }
        if(maxVal==-1) System.out.printf("\t Dealer Wins\n");
        else System.out.printf("\t %d pair. Player wins.\n", maxVal);
    }
}

