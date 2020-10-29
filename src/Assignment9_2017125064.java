import java.util.Scanner;

public class Assignment9_2017125064 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int playCnt=0;
        char usrCmd;
        while(true)
        {
            System.out.printf("Play Game?(Y/N): ");
            usrCmd = input.next().charAt(0);
            if(usrCmd=='y'||usrCmd=='Y') {
                playCnt++;
                OnePairCard newGame = new OnePairCard(playCnt);
                newGame.GamePlay();
            }
            else System.exit(0);
        }
    }
}
