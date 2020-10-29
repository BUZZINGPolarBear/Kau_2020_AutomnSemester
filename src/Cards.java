public class Cards {
    private String suit;
    private int face;

    public Cards(String cardSuit, int cardface) {
        suit = cardSuit;
        face = cardface;
    }

    public int getFace(){return face;}
    public String getSuit()
    {
        return  suit;
    }

    public String toString() {
        return suit + face;
    }
}
