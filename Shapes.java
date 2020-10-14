import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Shapes
{
    private class TransparentPanel extends JPanel
    {
        {
            setOpaque(false);
        }
    }
    public static void main(String[] args)
    {
        enginePart();
    }
    static void enginePart()
    {
        JFrame application= new JFrame();
        btnConstructor makeBtn = new btnConstructor();
        makeShapes panel = new makeShapes(0,0,0,0,0,0);
        randomNumMemorize memorizeIt = new randomNumMemorize();
        Random getRandomNum = new Random();
        int[] thirdChoice = new int[2], colorField = new int[100];
        int memorizeItArr[][][] = new int[100][25][10];
        //3차원 배열을 선언하여 저장. 1번째 칸에는 도형의 코드, 2번째 칸에는 k번째 도형의 각각 갯수, 3번째 칸에는 k번째 도형의 정보를 담습니다.
        int choiceCnt=0, makeItCnt, thirdChoiceOfK, thirdChoiceOfColor;
        int applicationWidth=500, applicationHeigt=500;
        application.setSize(applicationWidth, applicationHeigt);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true)
        {
            int first_choice = makeBtn.optionBtn();
            //입력하기, 색깔바꾸기, 종료하기 중 하나 선택
            if(first_choice==0)
            {//입력하기 선택
                int secondChoice = makeBtn.drawSelected();//사용자 도형 설정
                makeItCnt = getRandomNum.nextInt(14)+6;//생성할 도형 개수 지정
                for(int i=0;i<makeItCnt;i++)
                {
                    memorizeItArr[choiceCnt][i] = memorizeIt.randomNumMemorize(secondChoice, 0);
                }
                choiceCnt+=1;
                //k번째 도형 == choiceCnt
                continue;
            }
            else if(first_choice==1)
            {//k번째 도형 색깔 바꾸기 선택
                thirdChoice = makeBtn.changeColorSelected();//k 선택부
                thirdChoiceOfK = thirdChoice[0] - 1;//콤퓨타는 0부터 세니까 여기서 1 빼줍니다.
                thirdChoiceOfColor = thirdChoice[1];
                if(thirdChoiceOfK == -1 || thirdChoiceOfColor==-1) continue;
                //for(int i=0; i<20; i++) memorizeItArr[thirdChoiceOfK][i][5] = thirdChoiceOfColor;
                colorField[thirdChoiceOfK] = thirdChoiceOfColor;
                continue;
            }
            else
            {//추가동작 선택
                /*JFrame application= new JFrame();
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application.setSize(500,500);*/
                int fourthChoice = makeBtn.additionalActionSelected();
                if(fourthChoice==0)
                {//도형 숨기기
                    hide(panel, application, applicationWidth, applicationHeigt);
                    continue;
                }
                else if(fourthChoice==1)
                {//도형 보이기
                    for(int i=0;i<choiceCnt;i++)
                    {
                        System.out.printf("색깔: %d\n", colorField[i]);
                        for(int j=0; j<20; j++)
                        {
                            panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], colorField[i]);
                            panel.setOpaque(false);//투명화
                            application.add(panel);
                            application.setVisible(true);
                        }
                    }
                }
                else
                {//종료
                    System.exit(0);
                }
            }
        }
    }
    static void hide(makeShapes panel, JFrame application, int width, int height)
    {
        panel = new makeShapes(100,0,0,width,height,100);
        application.add(panel);
        application.setVisible(true);
    }
}
class makeShapes extends JPanel
{
    private int choice, x, y, size1, size2;
    private int color=0;// 0:red, 1:green, 2:blue, 3:yellow, 4:purple 5:black
    public makeShapes(int choice, int x, int y, int size1, int size2, int usrColor)
    {
        this.choice = choice;
        this.x = x;
        this.y = y;
        this.size1 = size1;
        this.size2 = size2;
        this.color = usrColor;
    }

    public void paintComponent(Graphics g)
    {
        //super.paintComponent(g);
        switch(color)
        {
            case 100:
                g.setColor(Color.WHITE);
                break;
            case 1:
                g.setColor(Color.red);
                break;
            case 2:
                g.setColor(Color.green);
                break;
            case 3:
                g.setColor(Color.blue);
                break;
            case 4:
                g.setColor(Color.yellow);
                break;
            case 5: case 0:
                g.setColor(Color.BLACK);
                break;
        }
        switch (choice)
        {
            case 100:
                g.fillRect(0,0,500,500);
                break;
            case 0:
                g.drawOval(x, y, size1, size2);
                break;
            case 1:
                g.drawRect(x, y, size1, size2);
                break;
            case 2:
                g.drawLine(x,y, x+size1, x+size2);
                break;
        }
    }
}
class randomNumMemorize
{
    Random getRandom = new Random();
    private int choice, x, y, size1, size2, cnt;
    private int color=1;
    public int[] randomNumMemorize(int usrchoice, int usrcolor)
    {
        this.choice = usrchoice;
        this.x = getRandom.nextInt(400);
        this.y = getRandom.nextInt(400);
        this.size1 = getRandom.nextInt(100)+1;
        this.size2 = getRandom.nextInt(100)+1;
        this.color = usrcolor;
        int[] retArr = {choice, x, y, size1, size2, color};
        return retArr;
    }
}
class btnConstructor
{
    public int optionBtn()
    {
        String btn_msg[] = {"입력 하기", "색깔 바꾸기", "추가동작"};
        int num = JOptionPane.showOptionDialog(null,"원하는 동작을 선택해주세요.","유저 선택",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"입력 하기");
        return num;
    }
    public int drawSelected()
    {
        String btn_msg[] = {"원", "사각형", "선"};
        int num = JOptionPane.showOptionDialog(null,"원하는 그림을 선택해주세요.","도형 선택",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"원");
        return num;
    }
    public int[] changeColorSelected()
    {
        int choiceOfK, choiceOfColor;
        String numOfK = JOptionPane.showInputDialog("몇번째 그린 도형의 색깔을 바꾸시겠습니까?");
        String numOfColor = JOptionPane.showInputDialog("무슨 색으로 변경하시겠습니까?\nRed:1 Green:2  Blue:3  Yellow:4  Black:5");
        if(numOfK==null || numOfColor==null) choiceOfK = choiceOfColor=-1;
        else {
            choiceOfK = Integer.parseInt(numOfK);
            choiceOfColor = Integer.parseInt(numOfColor);
        }
        int[] return_it = {choiceOfK, choiceOfColor};
        return return_it;
    }
    public int additionalActionSelected()
    {
        String btn_msg[] = {"도형 숨기기", "도형 보이기", "종료"};
        int num = JOptionPane.showOptionDialog(null,"원하는 동작을 선택해 주세요.","도형 선택",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"원");
        return num;
    }
}