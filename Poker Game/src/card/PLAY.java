package card;

import java.awt.Choice;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PLAY extends JFrame {
	private GUI main;
	SetPlayer setPlayer = new SetPlayer();
    PokerGame pokerGame = new PokerGame();
	BufferedImage img = null;
	JButton play = new JButton(new ImageIcon("./image/play.png"));
	JButton explain = new JButton(new ImageIcon("./image/explain.png"));
	JButton exit = new JButton(new ImageIcon("./image/exit.png"));

	public static void main(String[] args) {
		new PLAY();
	}

	public PLAY() {
		setTitle("G조 포커게임 - 게임설정화면");
		setSize(700, 700);
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
			img = ImageIO.read(new File("./image/main2.png"));
		} catch (IOException e) {
			System.out.println("이미지 불러오기 실패");
			System.exit(0);
		}

		MyPanel panel = new MyPanel();
		panel.setBounds(0, 0, 700, 700);

		JTextField player1 = new JTextField(10);
		JTextField player2 = new JTextField(10);
		JTextField player3 = new JTextField(10);
		JTextField player4 = new JTextField(10);
		JTextField player5 = new JTextField(10);
		player1.setBounds(250, 260, 200, 20);
		player2.setBounds(250, 290, 200, 20);
		player3.setBounds(250, 320, 200, 20);
		player4.setBounds(250, 350, 200, 20);
		player5.setBounds(250, 380, 200, 20);
		
		Choice choice = new Choice();
		choice.add("Number of Player");
		choice.add("1");
		choice.add("2");
		choice.add("3");
		choice.add("4");
		choice.add("5");
		choice.setBounds(280, 200, 140, 50);
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String temp = choice.getSelectedItem();
				
				MAIN.Selectednum = Integer.parseInt(temp);
				GUI.selection();
			}
		});
		switch (MAIN.Selectednum) {
		case 0:
			break;
		case 1:
			add(player1);
			break;
		case 2:
			add(player1);
			add(player2);
			break;
		case 3:
			add(player1);
			add(player2);
			add(player3);
			break;
		case 4:
			add(player1);
			add(player2);
			add(player3);
			add(player4);
			break;
		case 5:
			add(player1);
			add(player2);
			add(player3);
			add(player4);
			add(player5);
			break;
		}
		
		play.setBounds(140, 510, 193, 40);
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
				if(player1.getText()!="")
					MAIN.pname[0] = player1.getText();
				if(player2.getText()!="")
					MAIN.pname[1] = player2.getText();
				if(player3.getText()!="")
					MAIN.pname[2] = player3.getText();
				if(player4.getText()!="")
					MAIN.pname[3] = player4.getText();
				if(player5.getText()!="")
					MAIN.pname[4] = player5.getText();
				setPlayer.SetPlayer();
				pokerGame.GamePlay();
				GUI.game();
			}
		});
		exit.setBounds(360, 510, 193, 40);
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
				GUI.backtomenu();
			}
		});

		add(choice);
		add(play);
		add(exit);
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
