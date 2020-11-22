package card;

import java.util.Scanner;

public class SetPlayer {
    public void SetPlayer() {
        Scanner input = new Scanner(System.in);
        int plyerNumber = 0;
        PokerGame pokerGame = new PokerGame();
        plyerNumber = MAIN.Selectednum;
        pokerGame.plyerNumber = plyerNumber; 

        for(int i=0; i<plyerNumber; i++)
        {
            pokerGame.plyerNames[i] = MAIN.pname[i];
        }
    }

}