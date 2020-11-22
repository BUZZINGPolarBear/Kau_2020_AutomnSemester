package card;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Result extends JFrame{
	private GUI main;

	private Font font = new Font("맑은 고딕", 30, 30);
	BufferedImage img = null;
	JButton exit = new JButton(new ImageIcon("./image/exit.png"));
    JButton play = new JButton(new ImageIcon("./image/regame.png"));
	public static void main(String[] args) {
		new Result();
	}
	public Result() {
		setTitle("G조 포커게임 - 게임결과");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 설정
		setLayout(null); // 절대값
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1200, 800);
		layeredPane.setLayout(null);

		// 이미지 받아오기
		try {
			img = ImageIO.read(new File("./image/result.png"));
		} catch (IOException e) {
			System.out.println("이미지 불러오기 실패");
			System.exit(0);
		}
		//결과값출력

		JLabel winner = new JLabel("우승자는 "+ MAIN.Winner +"입니다!");
		  
		winner.setFont(new Font("맑은 고딕", Font.BOLD, 30)); //폰트 설정
		winner.setSize(500, 50);  //크기 설정
		winner.setLocation(430, 220); //위치 설정

		JLabel label = new JLabel("우승자의 카드는 "+ MAIN.win_p/*MAIN.result*/ +"입니다!");
		  
		label.setFont(new Font("맑은 고딕", Font.BOLD, 30)); //폰트 설정
		label.setSize(800, 50);  //크기 설정
		label.setLocation(390, 280); //위치 설정
		

		JButton p1name = new JButton(MAIN.pname[0]+"님의 카드는 "+ MAIN.resul[0][1] +"입니다!");
		p1name.setBounds(180, 350, 800, 50);
		p1name.setFocusPainted(false);
		p1name.setBorderPainted(false);
		p1name.setContentAreaFilled(false);
		p1name.setForeground(Color.BLACK);
		p1name.setFont(font);
		
		if(MAIN.resul[0][1]==null) {
			p1name.setEnabled(false);
		}		
		
		JButton p2name = new JButton(MAIN.pname[1]+"님의 카드는 "+ MAIN.resul[1][1] +"입니다!");
		p2name.setBounds(180, 420, 800, 50);
		p2name.setFocusPainted(false);
		p2name.setBorderPainted(false);
		p2name.setContentAreaFilled(false);
		p2name.setForeground(Color.BLACK);
		p2name.setFont(font);

		if(MAIN.resul[1][1]==null) {
			p2name.setEnabled(false);
		}		
		
		JButton p3name = new JButton(MAIN.pname[2]+"님의 카드는 "+ MAIN.resul[2][1] +"입니다!");
		p3name.setBounds(180, 490, 800, 50);
		p3name.setFocusPainted(false);
		p3name.setBorderPainted(false);
		p3name.setContentAreaFilled(false);
		p3name.setForeground(Color.BLACK);
		p3name.setFont(font);

		if(MAIN.resul[2][1]==null) {
			p3name.setEnabled(false);
		}	
		
		JButton p4name = new JButton(MAIN.pname[3]+"님의 카드는 "+ MAIN.resul[3][1] +"입니다!");
		p4name.setBounds(180,560, 800, 50);
		p4name.setFocusPainted(false);
		p4name.setBorderPainted(false);
		p4name.setContentAreaFilled(false);
		p4name.setForeground(Color.BLACK);
		p4name.setFont(font);
		
		if(MAIN.resul[3][1]==null) {
			p4name.setEnabled(false);
		}		
		
		JButton p5name = new JButton(MAIN.pname[4]+"님의 카드는 "+ MAIN.resul[4][1] +"입니다!");
		p5name.setBounds(180, 630, 800, 50);
		p5name.setFocusPainted(false);
		p5name.setBorderPainted(false);
		p5name.setContentAreaFilled(false);
		p5name.setForeground(Color.BLACK);
		p5name.setFont(font);
		
		if(MAIN.resul[4][1]==null) {
			p5name.setEnabled(false);
		}			
		
        play.setBounds(920, 70, 193, 60);
        play.setBorderPainted(false);
        play.setFocusPainted(false); 
        play.setContentAreaFilled(false);
        play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 올라갔을때
				play.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// 마우스 내려왔을 때
			}

			@Override
			public void mousePressed(MouseEvent e) {
				MAIN.Selectednum = 0;
				MAIN.Winner = " ";
				MAIN.count = 0;
				MAIN.page1 = 0;
				MAIN.page2 = 0;
				MAIN.page3 = 0;
				MAIN.page4 = 0;
				MAIN.page5 = 0;
				MAIN.count = 0;
				for(int i = 0;i<5;i++) {
			          MAIN.pname[i]=""+(i+1);
			    }
				GUI.back();
			}
        });		
		exit.setBounds(925, 120, 193, 60);
		exit.setBorderPainted(false);
		exit.setFocusPainted(false);
		exit.setContentAreaFilled(false);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 올라갔을때
				exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// 마우스 내려왔을 때
			}

			@Override
			public void mousePressed(MouseEvent e) {
				MAIN.Selectednum = 0;
				MAIN.Winner = " ";
				MAIN.count = 0;
				MAIN.page1 = 0;
				MAIN.page2 = 0;
				MAIN.page3 = 0;
				MAIN.page4 = 0;
				MAIN.page5 = 0;
				MAIN.count = 0;
				for(int i = 0;i<5;i++) {
			          MAIN.pname[i]=""+(i+1);
			    }
				GUI.backtomenu2();

		        
			}
		});
		
		MyPanel panel = new MyPanel();
		panel.setBounds(0, 0, 1200, 800);
		
		add(winner);
		add(label);
		add(p1name);
		add(p2name);
		add(p3name);
		add(p4name);
		add(p5name);

		add(exit);
		add(play);

		layeredPane.add(panel);
		add(layeredPane);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}

	public void setMain(GUI main) {
		this.main = main;
	}
}
