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
        JFrame application= new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500, 500);
        btnConstructor makeBtn = new btnConstructor();
        makeShapes panel = new makeShapes(0,0,0,0,0,0);
        int[] memorizeItArr[][] = new int[100][25][10];
        //3차원 배열을 선언하여 저장. 1번째 칸에는 k번째 도형, 2번째 칸에는 k번째 도형의 위치,크기 정보, 3번째 칸에는 k번째 도형의 색깔정보를 담습니다.
        randomNumMemorize memorizeIt = new randomNumMemorize();
        int choiceCnt=0, makeItCnt;
        Random getRandomNum = new Random();
        while(true)
        {
            int first_choice = makeBtn.optionBtn();
            //입력하기, 색깔바꾸기, 종료하기중 하나 선택
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

                for(int i=0;i<choiceCnt;i++)
                {//새로 입력된 도형을 그립니다.
                    panel = new makeShapes(-1,0,0,0,0,-1);
                    for(int j=0; j<makeItCnt; j++)
                    {
                        panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], 5);
                        panel.setOpaque(false);//투명화. 배경을 없애 도형을 겹칠 수 있다.
                        application.add(panel);
                        application.setVisible(true);
                    }
                }
                application.repaint();
                continue;
            }
            else if(first_choice==1)
            {//k번째 도형 색깔 바꾸기 선택
                int thirdChoice[] = makeBtn.changeColorSelected();//k 선택부
                int thirdChoiceOfK, thirdChoiceOfColor;
                thirdChoiceOfK = thirdChoice[0] - 1;//콤퓨타는 0부터 세니까 여기서 1 빼줍니다.
                thirdChoiceOfColor = thirdChoice[1];
                if(thirdChoiceOfK == -1 || thirdChoiceOfColor==-1) continue;
                panel = new makeShapes(-1,0,0,0,0,-1);
                for(int i=0;i<choiceCnt;i++)
                {
                    for(int j=0; j<20; j++)
                    {
                        if(i==thirdChoiceOfK)
                        {
                            panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], thirdChoiceOfColor);
                            panel.setOpaque(false);//투명화
                            application.add(panel);
                            application.setVisible(true);
                        }
                        else {
                            panel = new makeShapes(memorizeItArr[i][j][0], memorizeItArr[i][j][1], memorizeItArr[i][j][2], memorizeItArr[i][j][3], memorizeItArr[i][j][4], 5);
                            panel.setOpaque(false);//투명화
                            application.add(panel);
                            application.setVisible(true);
                        }
                    }
                }
                continue;
            }
            else
            {//추가동작 선택
                int fourthChoice = makeBtn.additionalActionSelected();
                if(fourthChoice==0)
                {
                    System.out.println("도형 숨기기");
                }
                else if(fourthChoice==1)
                {
                    System.out.println("도형 보이기");
                }
                else
                {
                    System.exit(0);
                }
            }
        }
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
        super.paintComponent(g);
        switch(color)
        {
            case -1:
                g.setColor(Color.WHITE);
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
            case 5:
                g.setColor(Color.BLACK);
                break;
        }
        switch (choice)
        {
            case -1:
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