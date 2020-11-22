package card;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PokerGame {
    private int cnt;
    private Cards getCard, getCard2;
    private Cards[][] fiveCards = new Cards[10][10];
    public static String[] plyerNames = new String[10];
    public static int plyerNumber;
    
    public static int[] save= new int[10];
    public static int temp=0;
    public static int tem_num=0;
    public static String winner;
    public static int max_1=0;
    public static int max_2=-1;
    public static int count_a=0;
    public static int count_b=0;
    public static int[] max_a=new int[5];
    public static int[] max_b=new int[5];
    public static int maximum_1=0;
    public static int maximum_2=0;


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
    {
        for(int i=0; i<plyerNumber; i++)
        {
            CardSort(i);
            System.out.printf("%s: ", plyerNames[i]);
            for(int j=0;j<5;j++)
            {
                MAIN.gets[i][j]=fiveCards[i][j].toString();
            }
            MAIN.resul[i][1] = rankMyHand(i);
            
            save[i]=temp;
            
            System.out.printf("\n");
        }

        boolean a=false;
        tem_num=5;
        save[tem_num]=0;
        for(int i=0;i<plyerNumber;i++) {
        	System.out.printf("save : %d ", save[i]);
        	if(save[i]>save[tem_num]) {
        		tem_num=i;
        		a=false;
        	}else if(save[i]==save[tem_num]) {
        		if(save[i]==1) {
        			if(suitToint(fiveCards[tem_num][0])>suitToint(fiveCards[i][0])){
        				continue;
        			}else if(suitToint(fiveCards[tem_num][0])<suitToint(fiveCards[i][0])) {
        				tem_num=i;
        			}else {
        				System.out.println("1 t");
        				a=true;
        			}
        		}else if(save[i]==2) {
        			for(int j=0;j<5;j++) {
        				for(int k=j+1;k<5;k++) {
        					if(j==4) {
        						break;
        					}
        					if(fiveCards[tem_num][j].getFace()==fiveCards[tem_num][k].getFace()) {
        						max_1=fiveCards[tem_num][j].getFace();
        						System.out.println("max_1 :"+max_1);
        					}
        					if(fiveCards[i][j].getFace()==fiveCards[i][k].getFace()) {
        						max_2=fiveCards[i][j].getFace();
        						System.out.println("max_2 :"+max_2);
        					}
        				}
        			}
        			if(max_1>max_2) {
						continue;
					}
					if(max_1<max_2) {
						tem_num=i;
					}if (max_1==max_2) {
						System.out.println("2 t");
						for(int j=0;j<5;j++) {
							if(fiveCards[tem_num][j].getFace()>maximum_1) {
								maximum_1=fiveCards[tem_num][j].getFace();
							}
							if(fiveCards[i][j].getFace()>maximum_2) {
								maximum_2=fiveCards[i][j].getFace();
							}
						}
						if(maximum_1>maximum_2) {
							continue;
						}else if(maximum_1<maximum_2) {
							tem_num=i;
						}else {
							a=true;
						}
					}
        			System.out.println(tem_num);
        		}
        		
        		
 
        		else if(save[1]==3) {
        			count_a=0;
        			count_b=0;
        			for(int j=0;j<5;j++) {
        				for(int k=j+1;k<5;k++) {
        					if(j==4) {
        						break;
        					}
        					if(fiveCards[tem_num][j].getFace()==fiveCards[tem_num][k].getFace()) {
        						max_a[count_a]=fiveCards[tem_num][j].getFace();
        						
        						count_a++;
        					}
        					if(fiveCards[i][j].getFace()==fiveCards[i][k].getFace()) {
        						max_b[count_b]=fiveCards[i][j].getFace();
        						
        						count_b++;
        					}
        				}
        			}
        			Arrays.sort(max_a);
        			Arrays.sort(max_b);
        			for(int l=0;l<max_a.length;l++) {
        				System.out.printf("maxa %d\n",max_a[l]);
        				System.out.printf("maxb %d\n",max_b[l]);
        			}
        			
        			if(max_a[4]>max_b[4]) {
        				continue;
        			}else if(max_a[4]<max_b[4]) {
        				tem_num=i;
        			}else if(max_a[4]==max_b[4]&&max_a[3]>max_b[3]) {
        				continue;
        			}else if(max_a[4]==max_b[4]&&max_a[3]<max_b[3]) {
        				tem_num=1;
        			}else if(max_a[4]==max_b[4]&&max_a[3]==max_b[3]) {
        				a=true;
        			}
        		}
        	}
        }
        if(a==true) {
        	MAIN.Winner="draw";
        }else {
        	MAIN.Winner=plyerNames[tem_num];
        	MAIN.win_p=MAIN.resul[tem_num][1];
        }
        System.out.printf("Winner : %s", plyerNames[tem_num]);
    }

    public void CardSort(int sortNthPlayerCard)
    {
        Cards[] sortMyDeck = new Cards[5];
        sortMyDeck = fiveCards[sortNthPlayerCard];
        for(int i=0; i<5; i++)
        {
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
    {
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
        rankMyDeck = fiveCards[rankNthPlayer];
        boolean straight=false, royal=false, flush=true, trips=false, quads=false;
        int numPair=0;

        int straightCounter=0;
        for(int i=1; i<5;i++)
        {
            if(rankMyDeck[i].getFace()==rankMyDeck[i-1].getFace()-1) ++straightCounter;
        }
        if(straightCounter==4)
        {
            straight=true;
            if(rankMyDeck[0].getFace()==14) royal = true;
        }
        else if (straightCounter==3 && rankMyDeck[0].getFace()==14 && rankMyDeck[1].getFace()==5)
        {
            straight = true;
        }
        for(int i=1; i<5;i++)
        {
            if(rankMyDeck[i].getSuit()!=rankMyDeck[i-1].getSuit())
            {
                flush=false;
            }
        }

        int[] pairRecognizeField = new int[15];
        for(int i=0;i<5;i++)
        {
            if(pairRecognizeField[rankMyDeck[i].getFace()] == 0)
            {
                for (int j = i + 1; j < 5; j++)
                {
                    if (rankMyDeck[i].getFace() == rankMyDeck[j].getFace())
                    {
                        pairRecognizeField[rankMyDeck[i].getFace()] += 1;
                    }
                }
            }
        }
        for(int i=1;i<=14;i++)
        {
            if(pairRecognizeField[i]==1) numPair++;
            if(pairRecognizeField[i]==2) trips=true;
            if(pairRecognizeField[i]==3) quads=true;
        }

        //String result = new String();
        if(royal && flush) { 
        	MAIN.result="Royal Flush";
        	System.out.println(MAIN.result);
        	temp=10;
        }
        else if(straight && flush) {
        	MAIN.result = "Straight Flush";
        	System.out.println(MAIN.result);
        	temp=9;
        }
        else if(quads) {
        	MAIN.result="Quads";
        	System.out.println(MAIN.result);
        	temp=8;
        }
        else if(trips && numPair==1) {
        	MAIN.result="FullHouse";
        	System.out.println(MAIN.result);
        	temp=7;
        }
        else if(flush) {
        	MAIN.result = "Flush";
        	System.out.println(MAIN.result);
        	temp=6;
        }
        else if(straight) {
        	MAIN.result = "Straight";
        	System.out.println(MAIN.result);
        	temp=5;
        }
        else if(trips) {
        	MAIN.result = "Trips";
        	System.out.println(MAIN.result);
        	temp=4;
        }
        else if(numPair==2) {
        	MAIN.result = "Two Pair";
        	System.out.println(MAIN.result);
        	temp=3;
        }
        else if(numPair==1) {
        	MAIN.result = "One Pair";
        	System.out.println(MAIN.result);    
        	temp=2;
        }
        else {
        	MAIN.result = "High Score) " + rankMyDeck[0].toString();
        	System.out.println(MAIN.result);
        	temp=1;
        }
        return MAIN.result;
    }
}


