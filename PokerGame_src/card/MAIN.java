package card;

import java.util.Scanner;

public class MAIN {
   static int Selectednum = 0;
   static String Winner;
   static int count = 0;
   static int page1 = 0;
   static int page2 = 0;
   static int page3 = 0;
   static int page4 = 0;
   static int page5 = 0;

   static String result = new String();
   static String win_p;
   static String[] pname = new String[5];
   static String[][] gets = new String[5][5];
   static String[][] resul = new String[5][2];
    public static void main(String[] args)
    {
       for(int i = 0;i<5;i++) {
          pname[i]=""+(i+1);
       }
        /*
        while(true) {
           setPlayer.SetPlayer();
            pokerGame.GamePlay();
        }
        */
        GUI main = new GUI();
        main.start = new START(); 
      main.start.setMain(main);
    }
}