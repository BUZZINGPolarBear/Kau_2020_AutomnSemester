import java.awt.*;
import javax.lang.model.type.NullType;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class 과제6_2017125064_전준휘
{
    private class TransparentPanel extends JPanel
    {
        {
            setOpaque(false);
        }
    }
    public static void main(String[] args)
    {
        JFrame application= new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500, 500);
        btnConstructor makeBtn = new btnConstructor();
        int[] memorizeItArr[][] = new int[100][25][10];
        randomNumMemorize memorizeIt = new randomNumMemorize();
        int choiceCnt=0, makeItCnt;
        Random getRandomNum = new Random();
        while(true)
        {
            int first_choice = makeBtn.optionBtn();
            if(first_choice==0)
            {
                int secondChoice = makeBtn.drawSelected();//사용자 도형 설정
                makeItCnt = getRandomNum.nextInt(14)+6;//생성할 도형 개수 지정
                for(int i=0;i<makeItCnt;i++)
                {
                    memorizeItArr[choiceCnt][i] = memorizeIt.randomNumMemorize(secondChoice, 0);
                }
                choiceCnt+=1;
                for(int i=0;i<choiceCnt;i++)
                {
                    for(int j=0; j<makeItCnt; j++)
                    {
                        makeShapes panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], 0);
                        panel.setOpaque(false);//투명화
                        application.add(panel);
                        application.setVisible(true);
                    }
                }
                application.repaint();
                continue;
            }
            else if(first_choice==1)
            {
                int thirdChoice = makeBtn.changeColorSelected();
                thirdChoice -= 1;
                application= new JFrame();
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application.setSize(500, 500);
                for(int i=0;i<choiceCnt;i++)
                {
                    for(int j=0; j<20; j++)
                    {
                        if(i==thirdChoice)
                        {
                            makeShapes panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], 1);
                            panel.setOpaque(false);//투명화
                            application.add(panel);
                            application.setVisible(true);
                        }
                        else {
                            makeShapes panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], 0);
                            panel.setOpaque(false);//투명화
                            application.add(panel);
                            application.setVisible(true);
                        }
                    }
                }
                continue;
            }
            else
            {
                System.exit(0);
            }
        }
    }
}

class makeShapes extends JPanel
{
    private int choice, x, y, size1, size2;
    private int blackOrRed=0;//0이면 검정, 1이면 빨강으로
    public makeShapes(int choice, int x, int y, int size1, int size2, int blackOrRed)
    {
        this.choice = choice;
        this.x = x;
        this.y = y;
        this.size1 = size1;
        this.size2 = size2;
        this.blackOrRed = blackOrRed;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(blackOrRed==0) g.setColor(Color.BLACK);
        else g.setColor(Color.RED);
        switch (choice)
        {
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
    private int blackOrRed=1;//1이면 검정, 0이면 빨강으로
    public int[] randomNumMemorize(int choice, int color)
    {
        this.choice = choice;
        this.x = getRandom.nextInt(400);
        this.y = getRandom.nextInt(400);
        this.size1 = getRandom.nextInt(100)+1;
        this.size2 = getRandom.nextInt(100)+1;
        this.blackOrRed = color;
        int[] retArr = {choice, x, y, size1, size2, blackOrRed};
        return retArr;
    }
}

class btnConstructor
{
    public int optionBtn()
    {
        String btn_msg[] = {"입력 하기", "색깔 바꾸기", "종료하기"};
        int num = JOptionPane.showOptionDialog(null,"원하는 동작을 선택해주세요.","유저 선택",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"입력 하기");
        return num;
    }
    public int drawSelected()
    {
        String btn_msg[] = {"원", "사각형", "선"};
        int num = JOptionPane.showOptionDialog(null,"원하는 그림을 선택해주세요.","도형 선택",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn_msg,"원");
        return num;
    }
    public int changeColorSelected()
    {
        String num = JOptionPane.showInputDialog("몇번째 그린 도형의 색깔을 바꾸시겠습니까?");
        int choice = Integer.parseInt(num);
        return choice;
    }
}