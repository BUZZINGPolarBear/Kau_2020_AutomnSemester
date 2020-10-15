import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Shapes
{
    private class TransparentPanel extends JPanel
    {
        {
            setOpaque(false);
        }
    }
    static int applicationWidth=500, applicationHeight=500, choiceCnt=0;
    public static void main(String[] args)
    {
        enginePart();
    }
    static void enginePart()
    {
        JFrame application= new JFrame();
        btnConstructor makeBtn = new btnConstructor();
        int memorizeItArr[][][] = new int[10000][25][10];
        makeShapes panel = new makeShapes(memorizeItArr);
        randomNumMemorize memorizeIt = new randomNumMemorize();
        Random getRandomNum = new Random();
        int[] thirdChoice = new int[2], KthShapeCntField = new int[10000];
        //3차원 배열을 선언하여 저장. 1번째 칸에는 도형의 코드, 2번째 칸에는 k번째 도형의 각각 갯수, 3번째 칸에는 k번째 도형의 정보를 담습니다.
        int makeItCnt, thirdChoiceOfK, thirdChoiceOfColor;
        application.setSize(applicationWidth, applicationHeight);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true)
        {
            int first_choice = makeBtn.optionBtn();
            //입력하기, 색깔바꾸기, 종료하기 중 하나 선택
            if(first_choice==0)
            {//입력하기 선택
                int secondChoice = makeBtn.drawSelected();//사용자 도형 설정
                makeItCnt = getRandomNum.nextInt(9)+1;//생성할 도형 개수 지정
                KthShapeCntField[choiceCnt] = makeItCnt;
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
                System.out.println("==============REDRAW!!================");
                thirdChoice = makeBtn.changeColorSelected();//k 선택부
                thirdChoiceOfK = thirdChoice[0] - 1;//콤퓨타는 0부터 세니까 여기서 1 빼줍니다.
                thirdChoiceOfColor = thirdChoice[1];
                int temp= thirdChoiceOfK, i=0;
                if(thirdChoiceOfK == -1 || thirdChoiceOfColor==-1) continue;
                while(temp-KthShapeCntField[i]>=0)
                {
                    temp-=KthShapeCntField[i++];
                }
                memorizeItArr[i][temp][5] = thirdChoiceOfColor;
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
                    hide(panel, application, applicationWidth, applicationHeight);
                    continue;
                }
                else if(fourthChoice==1)
                {//도형 보이기
                    int temp=0;
                    application.revalidate();
                    application.repaint();
                    panel = new makeShapes(memorizeItArr);
                    panel.validate();
                    panel.repaint();
                    application.add(panel);
                    panel.setOpaque(false);//투명화
                    application.setVisible(true);
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
        int arr[][][]= new int[10][10][10];
        arr[0][0][5]=100;
        arr[0][0][0]=100;
        panel = new makeShapes(arr);
        application.add(panel);
        application.setVisible(true);
    }
}

class Rect extends makeShapes
{
    private int loc_x;
    private int loc_y;
    private int size_x;
    private int size_y;
    private int color;
    public Rect(int[][][] arr, int i, int j) {
        super(arr);
        loc_x = arr[i][j][1];
        loc_y = arr[i][j][2];
        size_x = arr[i][j][3];
        size_y = arr[i][j][4];
        color = arr[i][j][5];
    }

    public void paintComponent(Graphics g)
    {
        System.out.printf("x: %d y: %d sizeX: %d sizeY: %d\n",loc_x,loc_y,size_x,size_y);
    }
}
class Circle extends makeShapes
{
    private int loc_x;
    private int loc_y;
    private int size_x;
    private int size_y;
    private int color;
    public Circle(int[][][] arr, int i, int j) {
        super(arr);
        loc_x = arr[i][j][1];
        loc_y = arr[i][j][2];
        size_x = arr[i][j][3];
        size_y = arr[i][j][4];
        color = arr[i][j][5];
    }
    public void paintComponent(Graphics g)
    {
        System.out.printf("x: %d y: %d sizeX: %d sizeY: %d\n",loc_x,loc_y,size_x,size_y);
    }
}
class Line extends makeShapes
{
    private int loc_x;
    private int loc_y;
    private int size_x;
    private int size_y;
    private int color;
    public Line(int[][][] arr, int i, int j) {
        super(arr);
        loc_x = arr[i][j][1];
        loc_y = arr[i][j][2];
        size_x = arr[i][j][3];
        size_y = arr[i][j][4];
        color = arr[i][j][5];
    }

    public void paintComponent(Graphics g)
    {
        System.out.printf("x: %d y: %d sizeX: %d sizeY: %d\n",loc_x,loc_y,size_x,size_y);
    }
}


class makeShapes extends JPanel
{
    private int usrArr[][][];
    public makeShapes(int arr[][][])
    {
        this.usrArr = arr;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(usrArr[0][0][0]==100 && usrArr[0][0][5]==100)
        {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,500,500);
            return;
        }
        for(int i=0; i<Shapes.choiceCnt; i++)
        {
            for(int j=0;j<20;j++)
            {
                int color = usrArr[i][j][5];
                int choice = usrArr[i][j][0];
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
                        g.drawOval(usrArr[i][j][1], usrArr[i][j][2], usrArr[i][j][3], usrArr[i][j][4]);
                    case 1:
                        g.drawRect(usrArr[i][j][1], usrArr[i][j][2], usrArr[i][j][3], usrArr[i][j][4]);
                    case 2:
                        g.drawLine(usrArr[i][j][1], usrArr[i][j][2], usrArr[i][j][1]+usrArr[i][j][3], usrArr[i][j][2]+usrArr[i][j][4]);
                        break;
                }
            }
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
        String btn_msg[] = {"Draw Shapes", "Change Color", "Additional Action"};
        int num = JOptionPane.showOptionDialog(null,"Choose what you want.","User choice",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"Draw Shapes");
        return num;
    }
    public int drawSelected()
    {
        String btn_msg[] = {"Circle", "Rectangle", "Line"};
        int num = JOptionPane.showOptionDialog(null,"Choose your shape","Shape choice",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"Circle");
        return num;
    }
    public int[] changeColorSelected()
    {
        int choiceOfK, choiceOfColor;
        String numOfK = JOptionPane.showInputDialog("Enter number that you want to change color");
        String numOfColor = JOptionPane.showInputDialog("Which Color do you prefer?\nRed:1 Green:2  Blue:3  Yellow:4  Black:5");
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
        String btn_msg[] = {"Hide", "Show", "Exit"};
        int num = JOptionPane.showOptionDialog(null,"Choose your action","User choice",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"Restore");
        return num;
    }
}
