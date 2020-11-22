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

	private Font font = new Font("���� ���", 30, 30);
	BufferedImage img = null;
	JButton exit = new JButton(new ImageIcon("./image/exit.png"));
    JButton play = new JButton(new ImageIcon("./image/regame.png"));
	public static void main(String[] args) {
		new Result();
	}
	public Result() {
		setTitle("G�� ��Ŀ���� - ���Ӱ��");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̾ƿ� ����
		setLayout(null); // ���밪
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1200, 800);
		layeredPane.setLayout(null);

		// �̹��� �޾ƿ���
		try {
			img = ImageIO.read(new File("./image/result.png"));
		} catch (IOException e) {
			System.out.println("�̹��� �ҷ����� ����");
			System.exit(0);
		}
		//��������

		JLabel winner = new JLabel("����ڴ� "+ MAIN.Winner +"�Դϴ�!");
		  
		winner.setFont(new Font("���� ���", Font.BOLD, 30)); //��Ʈ ����
		winner.setSize(500, 50);  //ũ�� ����
		winner.setLocation(430, 220); //��ġ ����

		JLabel label = new JLabel("������� ī��� "+ MAIN.win_p/*MAIN.result*/ +"�Դϴ�!");
		  
		label.setFont(new Font("���� ���", Font.BOLD, 30)); //��Ʈ ����
		label.setSize(800, 50);  //ũ�� ����
		label.setLocation(390, 280); //��ġ ����
		

		JButton p1name = new JButton(MAIN.pname[0]+"���� ī��� "+ MAIN.resul[0][1] +"�Դϴ�!");
		p1name.setBounds(180, 350, 800, 50);
		p1name.setFocusPainted(false);
		p1name.setBorderPainted(false);
		p1name.setContentAreaFilled(false);
		p1name.setForeground(Color.BLACK);
		p1name.setFont(font);
		
		if(MAIN.resul[0][1]==null) {
			p1name.setEnabled(false);
		}		
		
		JButton p2name = new JButton(MAIN.pname[1]+"���� ī��� "+ MAIN.resul[1][1] +"�Դϴ�!");
		p2name.setBounds(180, 420, 800, 50);
		p2name.setFocusPainted(false);
		p2name.setBorderPainted(false);
		p2name.setContentAreaFilled(false);
		p2name.setForeground(Color.BLACK);
		p2name.setFont(font);

		if(MAIN.resul[1][1]==null) {
			p2name.setEnabled(false);
		}		
		
		JButton p3name = new JButton(MAIN.pname[2]+"���� ī��� "+ MAIN.resul[2][1] +"�Դϴ�!");
		p3name.setBounds(180, 490, 800, 50);
		p3name.setFocusPainted(false);
		p3name.setBorderPainted(false);
		p3name.setContentAreaFilled(false);
		p3name.setForeground(Color.BLACK);
		p3name.setFont(font);

		if(MAIN.resul[2][1]==null) {
			p3name.setEnabled(false);
		}	
		
		JButton p4name = new JButton(MAIN.pname[3]+"���� ī��� "+ MAIN.resul[3][1] +"�Դϴ�!");
		p4name.setBounds(180,560, 800, 50);
		p4name.setFocusPainted(false);
		p4name.setBorderPainted(false);
		p4name.setContentAreaFilled(false);
		p4name.setForeground(Color.BLACK);
		p4name.setFont(font);
		
		if(MAIN.resul[3][1]==null) {
			p4name.setEnabled(false);
		}		
		
		JButton p5name = new JButton(MAIN.pname[4]+"���� ī��� "+ MAIN.resul[4][1] +"�Դϴ�!");
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
				// ���콺�� �ö�����
				play.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// ���콺 �������� ��
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
				// ���콺�� �ö�����
				exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// ���콺 �������� ��
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
