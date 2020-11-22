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
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PLAY_GAME extends JFrame {
	private GUI main;
	String[] name = { "Player", "Score" };
	BufferedImage img = null;
	private Font font = new Font("Serif", Font.BOLD, 20);

	JButton exit = new JButton(new ImageIcon("./image/final.png"));
	JButton winner = new JButton(new ImageIcon("./image/check.png"));
	JButton crown = new JButton(new ImageIcon("./image/crown.png"));

	public static void main(String[] args) {
		new PLAY_GAME();
	}

	public PLAY_GAME() {
		setTitle("G조 포커게임 - 게임화면");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); 
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1000, 700);
		layeredPane.setLayout(null);
		try {
			img = ImageIO.read(new File("./image/playback.jpg"));
		} catch (IOException e) {
			System.out.println("이미지 불러오기 실패");
			System.exit(0);
		}

		JButton p1name = new JButton(MAIN.pname[0]);
		p1name.setBounds(50, 70, 100, 20);
		p1name.setFocusPainted(false);
		p1name.setBorderPainted(false);
		p1name.setContentAreaFilled(false);
		p1name.setForeground(Color.WHITE);
		p1name.setFont(font);

		JButton p2name = new JButton(MAIN.pname[1]);
		p2name.setBounds(250, 70, 100, 20);
		p2name.setFocusPainted(false);
		p2name.setBorderPainted(false);
		p2name.setContentAreaFilled(false);
		p2name.setForeground(Color.WHITE);
		p2name.setFont(font);

		JButton p3name = new JButton(MAIN.pname[2]);
		p3name.setBounds(450, 70, 100, 20);
		p3name.setFocusPainted(false);
		p3name.setBorderPainted(false);
		p3name.setContentAreaFilled(false);
		p3name.setForeground(Color.WHITE);
		p3name.setFont(font);

		JButton p4name = new JButton(MAIN.pname[3]);
		p4name.setBounds(650, 70, 100, 20);
		p4name.setFocusPainted(false);
		p4name.setBorderPainted(false);
		p4name.setContentAreaFilled(false);
		p4name.setForeground(Color.WHITE);
		p4name.setFont(font);

		JButton p5name = new JButton(MAIN.pname[4]);
		p5name.setBounds(850, 70, 100, 20);
		p5name.setFocusPainted(false);
		p5name.setBorderPainted(false);
		p5name.setContentAreaFilled(false);
		p5name.setForeground(Color.WHITE);
		p5name.setFont(font);

		winner.setBounds(600, 600, 193, 40);
		winner.setBorderPainted(false);
		winner.setFocusPainted(false);
		winner.setContentAreaFilled(false);
		winner.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 올라갔을때
				winner.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// 마우스 내려왔을 때
			}

			@Override
			public void mousePressed(MouseEvent e) {
				MAIN.count++;
				GUI.win();
			}
		});
		//
		if (MAIN.Winner == MAIN.pname[0]) {
			crown.setBounds(75, 10, 60, 50);
			crown.setFocusPainted(false);
			crown.setBorderPainted(false);
			crown.setContentAreaFilled(false);
		} else if (MAIN.Winner == MAIN.pname[1]) {
			crown.setBounds(275, 10, 60, 50);
			crown.setFocusPainted(false);
			crown.setBorderPainted(false);
			crown.setContentAreaFilled(false);
		} else if (MAIN.Winner == MAIN.pname[2]) {
			crown.setBounds(475, 10, 60, 50);
			crown.setFocusPainted(false);
			crown.setBorderPainted(false);
			crown.setContentAreaFilled(false);
		} else if (MAIN.Winner == MAIN.pname[3]) {
			crown.setBounds(675, 10, 60, 50);
			crown.setFocusPainted(false);
			crown.setBorderPainted(false);
			crown.setContentAreaFilled(false);
		} else if (MAIN.Winner == MAIN.pname[4]) {
			crown.setBounds(875, 10, 60, 50);
			crown.setFocusPainted(false);
			crown.setBorderPainted(false);
			crown.setContentAreaFilled(false);
		}
		if (MAIN.count%2 == 1) {
			add(crown);
		}
		//
		re1();
		re2();
		re3();
		re4();
		re5();
		switch (MAIN.Selectednum) {
		case 0:
			break;
		case 1:
			add(p1name);
			if (MAIN.page1 % 2 == 0) {
				JButton c1_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				c1_1.setFocusPainted(false);
				c1_1.setBorderPainted(false);
				c1_1.setContentAreaFilled(false);
				add(c1_1);
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
			break;
		case 2:
			add(p1name);
			add(p2name);
			if (MAIN.page1 % 2 == 0) {
				JButton c1_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				c1_1.setFocusPainted(false);
				c1_1.setBorderPainted(false);
				c1_1.setContentAreaFilled(false);
				add(c1_1);
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
			if (MAIN.page2 % 2 == 0) {
				JButton c2_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			}
			break;
		case 3:
			add(p1name);
			add(p2name);
			add(p3name);
			if (MAIN.page1 % 2 == 0) {
				JButton c1_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				c1_1.setFocusPainted(false);
				c1_1.setBorderPainted(false);
				c1_1.setContentAreaFilled(false);
				add(c1_1);
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
			if (MAIN.page2 % 2 == 0) {
				JButton c2_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			}
			if (MAIN.page3 % 2 == 0) {
				JButton c3_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} 
			break;
		case 4:
			add(p1name);
			add(p2name);
			add(p3name);
			add(p4name);
			if (MAIN.page1 % 2 == 0) {
				JButton c1_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				c1_1.setFocusPainted(false);
				c1_1.setBorderPainted(false);
				c1_1.setContentAreaFilled(false);
				add(c1_1);
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
			if (MAIN.page2 % 2 == 0) {
				JButton c2_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			}
			if (MAIN.page3 % 2 == 0) {
				JButton c3_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} 
			if (MAIN.page4 % 2 == 0) {
				JButton c4_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			}
			break;
		case 5:
			add(p1name);
			add(p2name);
			add(p3name);
			add(p4name);
			add(p5name);
			
			if (MAIN.page1 % 2 == 0) {
				JButton c1_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c1_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				c1_1.setFocusPainted(false);
				c1_1.setBorderPainted(false);
				c1_1.setContentAreaFilled(false);
				add(c1_1);
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
			if (MAIN.page2 % 2 == 0) {
				JButton c2_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c2_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			}
			if (MAIN.page3 % 2 == 0) {
				JButton c3_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c3_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} 
			if (MAIN.page4 % 2 == 0) {
				JButton c4_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c4_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			}
			if (MAIN.page5 % 2 == 0) {
				JButton c5_1 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c5_2 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c5_3 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c5_4 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				JButton c5_5 = new JButton(new ImageIcon("./image/Back_Face2.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} 
			break;
		}

		exit.setBounds(750, 600, 193, 40);
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
				GUI.result();
			}
		});
		p1name.addMouseListener(new MouseAdapter() {
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
				MAIN.page1++;
				GUI.win();
			}
		});
		p2name.addMouseListener(new MouseAdapter() {
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
				MAIN.page2++;
				GUI.win();
			}
		});
		p3name.addMouseListener(new MouseAdapter() {
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
				MAIN.page3++;
				GUI.win();
			}
		});
		p4name.addMouseListener(new MouseAdapter() {
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
				MAIN.page4++;
				GUI.win();
			}
		});
		p5name.addMouseListener(new MouseAdapter() {
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
				MAIN.page5++;
				GUI.win();
			}
		});

		MyPanel panel = new MyPanel();
		panel.setBounds(0, 0, 1000, 700);

		add(exit);
		add(winner);
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
	public void re1() {
		if (MAIN.page1 % 2 == 1) {
			if (MAIN.gets[0][0].equals("C2")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C3")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C3.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C4")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C4.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C5")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C5.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C6")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C6.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C7")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C7.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C8")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C8.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C9")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C9.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C10")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C10.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C11")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C11.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C12")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C12.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C13")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C13.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("C1")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/C14.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D2")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D3")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D3.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D4")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D4.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D5")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D5.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D6")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D6.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D7")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D7.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D8")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D8.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D9")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D9.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D10")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D10.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D11")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D11.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D12")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D12.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D13")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D13.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("D1")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/D14.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H2")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H3")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H3.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H4")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H4.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H5")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H5.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H6")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H6.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H7")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H7.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H8")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H8.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H9")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H9.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H10")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H10.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H11")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H11.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H12")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H12.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H13")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H13.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("H1")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/H14.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S2")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S2.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S3")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S3.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S4")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S4.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S5")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S5.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S6")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S6.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S7")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S7.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S8")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S8.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S9")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S9.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S10")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S10.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S11")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S11.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S12")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S12.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S13")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S13.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			} else if (MAIN.gets[0][0].equals("S1")) {
				JButton c1_1 = new JButton(new ImageIcon("./image/S14.png"));
				c1_1.setBounds(70, 100, 60, 80);
				add(c1_1);
			}
			if (MAIN.gets[0][1].equals("C2")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C2.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C3")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C3.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C4")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C4.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C5")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C5.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C6")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C6.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C7")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C7.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C8")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C8.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C9")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C9.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C10")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C10.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C11")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C11.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C12")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C12.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C13")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C13.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("C1")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/C14.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D2")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D2.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D3")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D3.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D4")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D4.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D5")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D5.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D6")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D6.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D7")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D7.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D8")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D8.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D9")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D9.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D10")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D10.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D11")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D11.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D12")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D12.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D13")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D13.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("D1")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/D14.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H2")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H2.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H3")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H3.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H4")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H4.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H5")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H5.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H6")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H6.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H7")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H7.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H8")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H8.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H9")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H9.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H10")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H10.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H11")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H11.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H12")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H12.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H13")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H13.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("H1")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/H14.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S2")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S2.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S3")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S3.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S4")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S4.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S5")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S5.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S6")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S6.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S7")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S7.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S8")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S8.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S9")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S9.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S10")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S10.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S11")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S11.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S12")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S12.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S13")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S13.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			} else if (MAIN.gets[0][1].equals("S1")) {
				JButton c1_2 = new JButton(new ImageIcon("./image/S14.png"));
				c1_2.setBounds(70, 190, 60, 80);
				add(c1_2);
			}
			if (MAIN.gets[0][2].equals("C2")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C2.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C3")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C3.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C4")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C4.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C5")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C5.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C6")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C6.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C7")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C7.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C8")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C8.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C9")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C9.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C10")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C10.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C11")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C11.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C12")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C12.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C13")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C13.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("C1")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/C14.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D2")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D2.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D3")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D3.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D4")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D4.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D5")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D5.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D6")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D6.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D7")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D7.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D8")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D8.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D9")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D9.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D10")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D10.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D11")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D11.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D12")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D12.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D13")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D13.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("D1")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/D14.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H2")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H2.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H3")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H3.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H4")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H4.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H5")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H5.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H6")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H6.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H7")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H7.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H8")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H8.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H9")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H9.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H10")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H10.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H11")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H11.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H12")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H12.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H13")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H13.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("H1")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/H14.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S2")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S2.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S3")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S3.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S4")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S4.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S5")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S5.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S6")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S6.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S7")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S7.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S8")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S8.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S9")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S9.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S10")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S10.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S11")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S11.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S12")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S12.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S13")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S13.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			} else if (MAIN.gets[0][2].equals("S1")) {
				JButton c1_3 = new JButton(new ImageIcon("./image/S14.png"));
				c1_3.setBounds(70, 280, 60, 80);
				add(c1_3);
			}
			if (MAIN.gets[0][3].equals("C2")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C2.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C3")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C3.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C4")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C4.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C5")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C5.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C6")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C6.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C7")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C7.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C8")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C8.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C9")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C9.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C10")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C10.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C11")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C11.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C12")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C12.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C13")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C13.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("C1")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/C14.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D2")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D2.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D3")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D3.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D4")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D4.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D5")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D5.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D6")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D6.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D7")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D7.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D8")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D8.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D9")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D9.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D10")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D10.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D11")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D11.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D12")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D12.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D13")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D13.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("D1")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/D14.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H2")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H2.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H3")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H3.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H4")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H4.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H5")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H5.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H6")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H6.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H7")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H7.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H8")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H8.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H9")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H9.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H10")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H10.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H11")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H11.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H12")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H12.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H13")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H13.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("H1")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/H14.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S2")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S2.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S3")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S3.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S4")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S4.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S5")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S5.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S6")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S6.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S7")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S7.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S8")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S8.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S9")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S9.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S10")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S10.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S11")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S11.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S12")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S12.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S13")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S13.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			} else if (MAIN.gets[0][3].equals("S1")) {
				JButton c1_4 = new JButton(new ImageIcon("./image/S14.png"));
				c1_4.setBounds(70, 370, 60, 80);
				add(c1_4);
			}
			if (MAIN.gets[0][4].equals("C2")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C2.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C3")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C3.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C4")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C4.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C5")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C5.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C6")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C6.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C7")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C7.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C8")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C8.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C9")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C9.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C10")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C10.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C11")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C11.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C12")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C12.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C13")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C13.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("C1")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/C14.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D2")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D2.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D3")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D3.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D4")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D4.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D5")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D5.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D6")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D6.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D7")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D7.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D8")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D8.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D9")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D9.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D10")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D10.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D11")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D11.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D12")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D12.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D13")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D13.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("D1")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/D14.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H2")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H2.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H3")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H3.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H4")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H4.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H5")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H5.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H6")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H6.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H7")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H7.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H8")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H8.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H9")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H9.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H10")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H10.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H11")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H11.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H12")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H12.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H13")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H13.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("H1")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/H14.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S2")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S2.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S3")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S3.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S4")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S4.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S5")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S5.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S6")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S6.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S7")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S7.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S8")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S8.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S9")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S9.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S10")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S10.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S11")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S11.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S12")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S12.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S13")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S13.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			} else if (MAIN.gets[0][4].equals("S1")) {
				JButton c1_5 = new JButton(new ImageIcon("./image/S14.png"));
				c1_5.setBounds(70, 460, 60, 80);
				add(c1_5);
			}
		}
	}
	public void re2() {
		if (MAIN.page2 % 2 == 1) {
			if (MAIN.gets[1][0].equals("C2")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C3")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C3.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C4")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C4.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C5")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C5.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C6")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C6.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C7")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C7.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C8")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C8.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C9")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C9.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C10")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C10.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C11")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C11.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C12")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C12.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C13")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C13.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("C1")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/C14.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D2")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D3")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D3.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D4")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D4.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D5")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D5.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D6")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D6.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D7")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D7.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D8")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D8.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D9")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D9.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D10")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D10.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D11")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D11.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D12")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D12.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D13")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D13.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("D1")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/D14.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H2")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H3")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H3.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H4")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H4.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H5")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H5.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H6")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H6.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H7")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H7.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H8")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H8.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H9")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H9.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H10")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H10.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H11")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H11.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H12")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H12.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H13")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H13.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("H1")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/H14.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S2")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S2.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S3")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S3.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S4")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S4.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S5")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S5.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S6")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S6.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S7")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S7.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S8")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S8.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S9")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S9.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S10")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S10.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S11")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S11.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S12")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S12.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S13")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S13.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			} else if (MAIN.gets[1][0].equals("S1")) {
				JButton c2_1 = new JButton(new ImageIcon("./image/S14.png"));
				c2_1.setBounds(270, 100, 60, 80);
				add(c2_1);
			}
			if (MAIN.gets[1][1].equals("C2")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C2.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C3")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C3.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C4")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C4.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C5")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C5.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C6")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C6.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C7")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C7.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C8")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C8.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C9")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C9.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C10")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C10.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C11")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C11.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C12")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C12.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C13")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C13.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("C1")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/C14.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D2")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D2.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D3")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D3.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D4")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D4.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D5")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D5.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D6")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D6.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D7")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D7.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D8")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D8.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D9")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D9.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D10")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D10.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D11")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D11.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D12")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D12.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D13")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D13.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("D1")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/D14.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H2")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H2.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H3")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H3.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H4")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H4.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H5")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H5.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H6")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H6.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H7")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H7.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H8")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H8.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H9")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H9.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H10")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H10.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H11")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H11.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H12")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H12.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H13")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H13.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("H1")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/H14.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S2")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S2.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S3")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S3.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S4")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S4.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S5")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S5.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S6")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S6.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S7")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S7.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S8")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S8.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S9")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S9.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S10")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S10.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S11")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S11.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S12")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S12.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S13")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S13.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			} else if (MAIN.gets[1][1].equals("S1")) {
				JButton c2_2 = new JButton(new ImageIcon("./image/S14.png"));
				c2_2.setBounds(270, 190, 60, 80);
				add(c2_2);
			}
			if (MAIN.gets[1][2].equals("C2")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C2.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C3")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C3.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C4")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C4.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C5")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C5.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C6")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C6.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C7")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C7.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C8")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C8.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C9")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C9.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C10")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C10.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C11")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C11.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C12")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C12.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C13")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C13.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("C1")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/C14.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D2")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D2.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D3")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D3.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D4")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D4.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D5")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D5.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D6")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D6.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D7")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D7.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D8")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D8.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D9")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D9.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D10")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D10.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D11")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D11.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D12")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D12.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D13")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D13.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("D1")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/D14.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H2")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H2.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H3")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H3.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H4")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H4.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H5")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H5.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H6")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H6.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H7")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H7.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H8")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H8.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H9")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H9.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H10")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H10.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H11")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H11.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H12")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H12.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H13")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H13.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("H1")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/H14.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S2")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S2.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S3")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S3.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S4")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S4.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S5")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S5.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S6")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S6.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S7")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S7.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S8")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S8.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S9")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S9.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S10")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S10.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S11")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S11.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S12")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S12.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S13")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S13.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			} else if (MAIN.gets[1][2].equals("S1")) {
				JButton c2_3 = new JButton(new ImageIcon("./image/S14.png"));
				c2_3.setBounds(270, 280, 60, 80);
				add(c2_3);
			}
			if (MAIN.gets[1][3].equals("C2")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C2.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C3")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C3.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C4")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C4.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C5")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C5.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C6")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C6.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C7")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C7.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C8")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C8.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C9")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C9.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C10")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C10.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C11")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C11.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C12")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C12.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C13")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C13.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("C1")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/C14.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D2")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D2.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D3")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D3.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D4")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D4.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D5")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D5.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D6")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D6.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D7")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D7.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D8")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D8.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D9")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D9.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D10")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D10.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D11")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D11.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D12")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D12.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D13")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D13.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("D1")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/D14.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H2")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H2.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H3")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H3.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H4")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H4.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H5")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H5.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H6")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H6.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H7")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H7.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H8")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H8.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H9")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H9.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H10")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H10.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H11")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H11.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H12")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H12.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H13")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H13.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("H1")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/H14.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S2")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S2.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S3")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S3.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S4")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S4.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S5")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S5.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S6")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S6.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S7")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S7.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S8")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S8.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S9")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S9.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S10")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S10.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S11")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S11.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S12")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S12.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S13")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S13.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			} else if (MAIN.gets[1][3].equals("S1")) {
				JButton c2_4 = new JButton(new ImageIcon("./image/S14.png"));
				c2_4.setBounds(270, 370, 60, 80);
				add(c2_4);
			}
			if (MAIN.gets[1][4].equals("C2")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C2.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C3")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C3.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C4")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C4.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C5")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C5.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C6")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C6.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C7")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C7.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C8")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C8.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C9")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C9.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C10")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C10.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C11")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C11.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C12")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C12.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C13")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C13.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("C1")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/C14.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D2")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D2.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D3")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D3.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D4")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D4.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D5")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D5.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D6")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D6.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D7")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D7.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D8")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D8.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D9")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D9.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D10")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D10.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D11")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D11.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D12")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D12.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D13")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D13.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("D1")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/D14.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H2")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H2.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H3")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H3.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H4")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H4.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H5")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H5.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H6")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H6.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H7")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H7.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H8")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H8.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H9")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H9.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H10")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H10.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H11")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H11.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H12")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H12.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H13")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H13.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("H1")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/H14.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S2")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S2.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S3")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S3.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S4")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S4.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S5")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S5.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S6")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S6.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S7")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S7.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S8")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S8.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S9")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S9.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S10")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S10.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S11")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S11.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S12")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S12.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S13")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S13.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			} else if (MAIN.gets[1][4].equals("S1")) {
				JButton c2_5 = new JButton(new ImageIcon("./image/S14.png"));
				c2_5.setBounds(270, 460, 60, 80);
				add(c2_5);
			}
		}
	}
	public void re3() {
		if (MAIN.page3 % 2 == 1) {
			if (MAIN.gets[2][0].equals("C2")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C3")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C3.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C4")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C4.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C5")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C5.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C6")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C6.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C7")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C7.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C8")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C8.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C9")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C9.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C10")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C10.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C11")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C11.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C12")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C12.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C13")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C13.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("C1")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/C14.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D2")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D3")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D3.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D4")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D4.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D5")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D5.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D6")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D6.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D7")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D7.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D8")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D8.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D9")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D9.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D10")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D10.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D11")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D11.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D12")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D12.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D13")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D13.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("D1")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/D14.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H2")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H3")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H3.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H4")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H4.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H5")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H5.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H6")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H6.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H7")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H7.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H8")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H8.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H9")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H9.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H10")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H10.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H11")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H11.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H12")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H12.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H13")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H13.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("H1")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/H14.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S2")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S2.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S3")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S3.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S4")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S4.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S5")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S5.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S6")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S6.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S7")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S7.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S8")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S8.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S9")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S9.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S10")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S10.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S11")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S11.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S12")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S12.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S13")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S13.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			} else if (MAIN.gets[2][0].equals("S1")) {
				JButton c3_1 = new JButton(new ImageIcon("./image/S14.png"));
				c3_1.setBounds(470, 100, 60, 80);
				add(c3_1);
			}
			if (MAIN.gets[2][1].equals("C2")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C2.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C3")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C3.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C4")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C4.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C5")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C5.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C6")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C6.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C7")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C7.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C8")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C8.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C9")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C9.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C10")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C10.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C11")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C11.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C12")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C12.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C13")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C13.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("C1")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/C14.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D2")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D2.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D3")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D3.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D4")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D4.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D5")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D5.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D6")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D6.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D7")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D7.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D8")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D8.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D9")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D9.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D10")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D10.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D11")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D11.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D12")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D12.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D13")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D13.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("D1")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/D14.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H2")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H2.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H3")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H3.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H4")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H4.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H5")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H5.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H6")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H6.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H7")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H7.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H8")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H8.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H9")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H9.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H10")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H10.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H11")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H11.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H12")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H12.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H13")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H13.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("H1")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/H14.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S2")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S2.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S3")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S3.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S4")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S4.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S5")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S5.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S6")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S6.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S7")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S7.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S8")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S8.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S9")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S9.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S10")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S10.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S11")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S11.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S12")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S12.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S13")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S13.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			} else if (MAIN.gets[2][1].equals("S1")) {
				JButton c3_2 = new JButton(new ImageIcon("./image/S14.png"));
				c3_2.setBounds(470, 190, 60, 80);
				add(c3_2);
			}
			if (MAIN.gets[2][2].equals("C2")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C2.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C3")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C3.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C4")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C4.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C5")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C5.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C6")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C6.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C7")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C7.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C8")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C8.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C9")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C9.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C10")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C10.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C11")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C11.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C12")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C12.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C13")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C13.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("C1")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/C14.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D2")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D2.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D3")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D3.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D4")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D4.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D5")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D5.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D6")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D6.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D7")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D7.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D8")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D8.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D9")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D9.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D10")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D10.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D11")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D11.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D12")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D12.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D13")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D13.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("D1")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/D14.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H2")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H2.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H3")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H3.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H4")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H4.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H5")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H5.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H6")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H6.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H7")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H7.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H8")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H8.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H9")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H9.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H10")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H10.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H11")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H11.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H12")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H12.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H13")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H13.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("H1")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/H14.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S2")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S2.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S3")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S3.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S4")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S4.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S5")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S5.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S6")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S6.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S7")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S7.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S8")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S8.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S9")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S9.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S10")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S10.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S11")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S11.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S12")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S12.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S13")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S13.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			} else if (MAIN.gets[2][2].equals("S1")) {
				JButton c3_3 = new JButton(new ImageIcon("./image/S14.png"));
				c3_3.setBounds(470, 280, 60, 80);
				add(c3_3);
			}
			if (MAIN.gets[2][3].equals("C2")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C2.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C3")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C3.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C4")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C4.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C5")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C5.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C6")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C6.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C7")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C7.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C8")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C8.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C9")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C9.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C10")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C10.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C11")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C11.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C12")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C12.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C13")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C13.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("C1")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/C14.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D2")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D2.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D3")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D3.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D4")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D4.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D5")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D5.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D6")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D6.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D7")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D7.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D8")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D8.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D9")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D9.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D10")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D10.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D11")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D11.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D12")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D12.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D13")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D13.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("D1")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/D14.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H2")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H2.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H3")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H3.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H4")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H4.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H5")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H5.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H6")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H6.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H7")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H7.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H8")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H8.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H9")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H9.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H10")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H10.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H11")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H11.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H12")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H12.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H13")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H13.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("H1")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/H14.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S2")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S2.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S3")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S3.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S4")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S4.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S5")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S5.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S6")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S6.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S7")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S7.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S8")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S8.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S9")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S9.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S10")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S10.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S11")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S11.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S12")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S12.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S13")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S13.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			} else if (MAIN.gets[2][3].equals("S1")) {
				JButton c3_4 = new JButton(new ImageIcon("./image/S14.png"));
				c3_4.setBounds(470, 370, 60, 80);
				add(c3_4);
			}
			if (MAIN.gets[2][4].equals("C2")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C2.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C3")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C3.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C4")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C4.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C5")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C5.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C6")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C6.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C7")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C7.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C8")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C8.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C9")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C9.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C10")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C10.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C11")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C11.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C12")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C12.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C13")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C13.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("C1")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/C14.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D2")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D2.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D3")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D3.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D4")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D4.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D5")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D5.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D6")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D6.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D7")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D7.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D8")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D8.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D9")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D9.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D10")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D10.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D11")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D11.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D12")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D12.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D13")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D13.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("D1")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/D14.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H2")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H2.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H3")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H3.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H4")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H4.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H5")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H5.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H6")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H6.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H7")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H7.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H8")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H8.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H9")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H9.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H10")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H10.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H11")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H11.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H12")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H12.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H13")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H13.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("H1")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/H14.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S2")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S2.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S3")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S3.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S4")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S4.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S5")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S5.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S6")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S6.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S7")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S7.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S8")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S8.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S9")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S9.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S10")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S10.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S11")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S11.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S12")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S12.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S13")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S13.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			} else if (MAIN.gets[2][4].equals("S1")) {
				JButton c3_5 = new JButton(new ImageIcon("./image/S14.png"));
				c3_5.setBounds(470, 460, 60, 80);
				add(c3_5);
			}
		}
	}
	public void re4() {
		if (MAIN.page4 % 2 == 1) {
			if (MAIN.gets[3][0].equals("C2")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C3")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C3.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C4")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C4.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C5")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C5.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C6")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C6.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C7")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C7.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C8")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C8.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C9")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C9.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C10")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C10.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C11")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C11.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C12")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C12.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C13")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C13.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("C1")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/C14.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D2")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D3")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D3.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D4")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D4.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D5")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D5.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D6")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D6.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D7")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D7.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D8")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D8.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D9")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D9.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D10")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D10.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D11")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D11.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D12")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D12.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D13")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D13.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("D1")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/D14.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H2")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H3")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H3.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H4")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H4.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H5")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H5.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H6")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H6.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H7")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H7.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H8")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H8.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H9")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H9.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H10")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H10.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H11")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H11.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H12")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H12.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H13")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H13.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("H1")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/H14.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S2")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S2.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S3")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S3.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S4")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S4.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S5")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S5.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S6")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S6.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S7")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S7.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S8")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S8.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S9")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S9.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S10")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S10.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S11")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S11.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S12")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S12.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S13")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S13.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			} else if (MAIN.gets[3][0].equals("S1")) {
				JButton c4_1 = new JButton(new ImageIcon("./image/S14.png"));
				c4_1.setBounds(670, 100, 60, 80);
				add(c4_1);
			}
			if (MAIN.gets[3][1].equals("C2")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C2.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C3")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C3.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C4")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C4.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C5")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C5.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C6")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C6.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C7")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C7.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C8")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C8.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C9")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C9.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C10")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C10.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C11")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C11.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C12")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C12.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C13")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C13.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("C1")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/C14.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D2")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D2.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D3")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D3.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D4")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D4.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D5")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D5.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D6")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D6.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D7")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D7.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D8")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D8.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D9")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D9.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D10")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D10.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D11")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D11.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D12")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D12.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D13")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D13.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("D1")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/D14.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H2")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H2.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H3")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H3.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H4")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H4.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H5")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H5.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H6")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H6.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H7")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H7.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H8")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H8.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H9")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H9.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H10")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H10.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H11")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H11.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H12")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H12.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H13")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H13.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("H1")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/H14.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S2")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S2.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S3")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S3.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S4")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S4.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S5")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S5.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S6")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S6.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S7")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S7.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S8")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S8.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S9")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S9.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S10")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S10.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S11")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S11.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S12")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S12.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S13")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S13.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			} else if (MAIN.gets[3][1].equals("S1")) {
				JButton c4_2 = new JButton(new ImageIcon("./image/S14.png"));
				c4_2.setBounds(670, 190, 60, 80);
				add(c4_2);
			}
			if (MAIN.gets[3][2].equals("C2")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C2.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C3")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C3.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C4")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C4.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C5")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C5.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C6")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C6.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C7")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C7.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C8")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C8.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C9")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C9.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C10")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C10.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C11")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C11.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C12")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C12.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C13")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C13.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("C1")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/C14.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D2")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D2.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D3")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D3.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D4")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D4.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D5")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D5.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D6")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D6.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D7")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D7.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D8")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D8.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D9")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D9.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D10")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D10.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D11")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D11.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D12")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D12.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D13")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D13.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("D1")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/D14.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H2")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H2.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H3")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H3.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H4")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H4.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H5")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H5.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H6")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H6.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H7")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H7.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H8")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H8.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H9")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H9.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H10")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H10.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H11")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H11.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H12")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H12.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H13")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H13.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("H1")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/H14.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S2")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S2.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S3")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S3.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S4")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S4.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S5")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S5.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S6")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S6.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S7")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S7.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S8")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S8.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S9")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S9.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S10")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S10.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S11")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S11.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S12")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S12.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S13")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S13.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			} else if (MAIN.gets[3][2].equals("S1")) {
				JButton c4_3 = new JButton(new ImageIcon("./image/S14.png"));
				c4_3.setBounds(670, 280, 60, 80);
				add(c4_3);
			}
			if (MAIN.gets[3][3].equals("C2")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C2.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C3")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C3.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C4")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C4.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C5")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C5.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C6")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C6.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C7")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C7.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C8")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C8.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C9")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C9.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C10")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C10.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C11")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C11.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C12")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C12.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C13")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C13.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("C1")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/C14.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D2")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D2.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D3")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D3.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D4")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D4.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D5")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D5.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D6")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D6.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D7")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D7.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D8")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D8.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D9")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D9.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D10")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D10.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D11")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D11.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D12")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D12.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D13")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D13.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("D1")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/D14.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H2")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H2.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H3")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H3.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H4")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H4.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H5")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H5.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H6")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H6.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H7")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H7.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H8")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H8.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H9")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H9.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H10")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H10.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H11")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H11.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H12")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H12.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H13")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H13.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("H1")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/H14.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S2")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S2.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S3")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S3.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S4")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S4.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S5")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S5.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S6")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S6.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S7")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S7.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S8")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S8.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S9")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S9.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S10")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S10.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S11")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S11.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S12")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S12.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S13")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S13.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			} else if (MAIN.gets[3][3].equals("S1")) {
				JButton c4_4 = new JButton(new ImageIcon("./image/S14.png"));
				c4_4.setBounds(670, 370, 60, 80);
				add(c4_4);
			}
			if (MAIN.gets[3][4].equals("C2")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C2.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C3")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C3.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C4")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C4.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C5")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C5.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C6")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C6.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C7")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C7.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C8")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C8.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C9")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C9.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C10")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C10.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C11")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C11.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C12")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C12.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C13")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C13.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("C1")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/C14.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D2")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D2.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D3")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D3.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D4")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D4.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D5")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D5.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D6")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D6.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D7")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D7.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D8")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D8.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D9")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D9.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D10")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D10.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D11")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D11.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D12")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D12.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D13")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D13.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("D1")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/D14.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H2")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H2.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H3")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H3.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H4")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H4.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H5")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H5.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H6")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H6.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H7")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H7.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H8")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H8.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H9")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H9.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H10")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H10.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H11")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H11.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H12")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H12.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H13")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H13.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("H1")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/H14.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S2")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S2.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S3")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S3.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S4")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S4.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S5")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S5.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S6")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S6.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S7")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S7.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S8")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S8.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S9")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S9.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S10")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S10.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S11")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S11.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S12")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S12.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S13")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S13.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			} else if (MAIN.gets[3][4].equals("S1")) {
				JButton c4_5 = new JButton(new ImageIcon("./image/S14.png"));
				c4_5.setBounds(670, 460, 60, 80);
				add(c4_5);
			}
		}
	}
	public void re5() {
		if (MAIN.page5 % 2 == 1) {
			if (MAIN.gets[4][0].equals("C2")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C2.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C3")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C3.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C4")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C4.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C5")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C5.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C6")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C6.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C7")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C7.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C8")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C8.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C9")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C9.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C10")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C10.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C11")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C11.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C12")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C12.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C13")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C13.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("C1")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/C14.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D2")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D2.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D3")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D3.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D4")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D4.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D5")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D5.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D6")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D6.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D7")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D7.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D8")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D8.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D9")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D9.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D10")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D10.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D11")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D11.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D12")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D12.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D13")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D13.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("D1")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/D14.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H2")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H2.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H3")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H3.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H4")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H4.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H5")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H5.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H6")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H6.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H7")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H7.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H8")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H8.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H9")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H9.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H10")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H10.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H11")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H11.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H12")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H12.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H13")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H13.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("H1")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/H14.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S2")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S2.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S3")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S3.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S4")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S4.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S5")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S5.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S6")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S6.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S7")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S7.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S8")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S8.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S9")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S9.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S10")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S10.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S11")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S11.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S12")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S12.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S13")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S13.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			} else if (MAIN.gets[4][0].equals("S1")) {
				JButton c5_1 = new JButton(new ImageIcon("./image/S14.png"));
				c5_1.setBounds(870, 100, 60, 80);
				add(c5_1);
			}
			if (MAIN.gets[4][1].equals("C2")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C2.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C3")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C3.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C4")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C4.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C5")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C5.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C6")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C6.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C7")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C7.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C8")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C8.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C9")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C9.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C10")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C10.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C11")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C11.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C12")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C12.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C13")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C13.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("C1")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/C14.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D2")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D2.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D3")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D3.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D4")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D4.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D5")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D5.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D6")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D6.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D7")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D7.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D8")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D8.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D9")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D9.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D10")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D10.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D11")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D11.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D12")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D12.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D13")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D13.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("D1")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/D14.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H2")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H2.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H3")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H3.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H4")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H4.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H5")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H5.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H6")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H6.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H7")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H7.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H8")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H8.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H9")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H9.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H10")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H10.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H11")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H11.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H12")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H12.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H13")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H13.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("H1")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/H14.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S2")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S2.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S3")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S3.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S4")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S4.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S5")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S5.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S6")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S6.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S7")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S7.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S8")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S8.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S9")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S9.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S10")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S10.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S11")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S11.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S12")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S12.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S13")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S13.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			} else if (MAIN.gets[4][1].equals("S1")) {
				JButton c5_2 = new JButton(new ImageIcon("./image/S14.png"));
				c5_2.setBounds(870, 190, 60, 80);
				add(c5_2);
			}
			if (MAIN.gets[4][2].equals("C2")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C2.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C3")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C3.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C4")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C4.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C5")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C5.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C6")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C6.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C7")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C7.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C8")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C8.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C9")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C9.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C10")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C10.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C11")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C11.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C12")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C12.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C13")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C13.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("C1")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/C14.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D2")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D2.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D3")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D3.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D4")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D4.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D5")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D5.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D6")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D6.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D7")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D7.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D8")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D8.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D9")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D9.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D10")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D10.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D11")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D11.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D12")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D12.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D13")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D13.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("D1")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/D14.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H2")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H2.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H3")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H3.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H4")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H4.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H5")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H5.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H6")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H6.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H7")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H7.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H8")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H8.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H9")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H9.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H10")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H10.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H11")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H11.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H12")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H12.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H13")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H13.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("H1")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/H14.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S2")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S2.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S3")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S3.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S4")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S4.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S5")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S5.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S6")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S6.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S7")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S7.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S8")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S8.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S9")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S9.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S10")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S10.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S11")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S11.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S12")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S12.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S13")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S13.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			} else if (MAIN.gets[4][2].equals("S1")) {
				JButton c5_3 = new JButton(new ImageIcon("./image/S14.png"));
				c5_3.setBounds(870, 280, 60, 80);
				add(c5_3);
			}
			if (MAIN.gets[4][3].equals("C2")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C2.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C3")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C3.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C4")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C4.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C5")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C5.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C6")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C6.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C7")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C7.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C8")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C8.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C9")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C9.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C10")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C10.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C11")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C11.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C12")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C12.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C13")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C13.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("C1")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/C14.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D2")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D2.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D3")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D3.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D4")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D4.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D5")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D5.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D6")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D6.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D7")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D7.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D8")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D8.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D9")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D9.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D10")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D10.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D11")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D11.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D12")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D12.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D13")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D13.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("D1")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/D14.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H2")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H2.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H3")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H3.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H4")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H4.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H5")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H5.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H6")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H6.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H7")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H7.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H8")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H8.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H9")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H9.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H10")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H10.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H11")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H11.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H12")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H12.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H13")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H13.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("H1")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/H14.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S2")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S2.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S3")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S3.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S4")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S4.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S5")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S5.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S6")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S6.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S7")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S7.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S8")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S8.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S9")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S9.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S10")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S10.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S11")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S11.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S12")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S12.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S13")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S13.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			} else if (MAIN.gets[4][3].equals("S1")) {
				JButton c5_4 = new JButton(new ImageIcon("./image/S14.png"));
				c5_4.setBounds(870, 370, 60, 80);
				add(c5_4);
			}
			if (MAIN.gets[4][4].equals("C2")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C2.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C3")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C3.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C4")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C4.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C5")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C5.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C6")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C6.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C7")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C7.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C8")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C8.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C9")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C9.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C10")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C10.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C11")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C11.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C12")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C12.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C13")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C13.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("C1")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/C14.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D2")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D2.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D3")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D3.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D4")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D4.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D5")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D5.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D6")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D6.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D7")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D7.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D8")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D8.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D9")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D9.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D10")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D10.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D11")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D11.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D12")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D12.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D13")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D13.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("D1")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/D14.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H2")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H2.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H3")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H3.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H4")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H4.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H5")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H5.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H6")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H6.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H7")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H7.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H8")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H8.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H9")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H9.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H10")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H10.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H11")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H11.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H12")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H12.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H13")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H13.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("H1")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/H14.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S2")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S2.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S3")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S3.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S4")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S4.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S5")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S5.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S6")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S6.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S7")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S7.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S8")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S8.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S9")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S9.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S10")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S10.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S11")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S11.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S12")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S12.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S13")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S13.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			} else if (MAIN.gets[4][4].equals("S1")) {
				JButton c5_5 = new JButton(new ImageIcon("./image/S14.png"));
				c5_5.setBounds(870, 460, 60, 80);
				add(c5_5);
			}
		}
	}
}