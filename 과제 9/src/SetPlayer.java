import java.util.Scanner;

public class SetPlayer {
    public void SetPlayer() {
        Scanner input = new Scanner(System.in);
        int plyerNumber = 0;
        PokerGame pokerGame = new PokerGame();
        System.out.println("!!!!!!!!!!ACE는 1이 아니라 14입니다!!!!!!!!!!");
        System.out.printf("How many Players?(input 1~5): ");
        plyerNumber = input.nextInt();
        pokerGame.plyerNumber = plyerNumber;

        for(int i=0; i<plyerNumber; i++)
        {
            System.out.printf("%d Player's name: ", i+1);
            String name = new String();
            name = input.next();
            pokerGame.plyerNames[i] = name;
        }
    }

}
