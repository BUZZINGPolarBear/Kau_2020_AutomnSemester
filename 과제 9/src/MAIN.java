import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        SetPlayer setPlayer = new SetPlayer();
        PokerGame pokerGame = new PokerGame();

        setPlayer.SetPlayer();
        pokerGame.GamePlay();
    }
}
