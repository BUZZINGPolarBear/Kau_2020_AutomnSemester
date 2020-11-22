package card;

import java.util.Random;
import java.lang.String;

public class DeckOfCards {
    private Cards[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARD = 52/*52*/;

    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        String[] suits = {"H", "D", "C", "S"};
        deck = new Cards[NUMBER_OF_CARD];
        currentCard = 0;
        for (int cnt = 0; cnt < NUMBER_OF_CARD; cnt++) {
            deck[cnt] = new Cards(suits[cnt / 13], /*a++*/cnt % 13 + 1);
            /*if(a==5) {
            	a=1;
            }*/
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < NUMBER_OF_CARD; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARD);

            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Cards dealCard() {
        if (currentCard < NUMBER_OF_CARD)
            return deck[currentCard++];
        else
            return null;
    }
}
