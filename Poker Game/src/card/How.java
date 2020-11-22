package card;

import java.awt.Cursor;
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

public class How extends JFrame {
	private GUI main;

	BufferedImage img = null;
	JButton exit = new JButton(new ImageIcon("./image/exit.png"));
	JButton play = new JButton(new ImageIcon("./image/play.png"));

	public static void main(String[] args) {
		new How();
	}

	public How() {
		setTitle("G조 포커게임 - 게임설명");
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
			img = ImageIO.read(new File("./image/how.png"));
		} catch (IOException e) {
			System.out.println("이미지 불러오기 실패");
			System.exit(0);
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
				GUI.howbegin();
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
				GUI.howback();
			}
		});

		MyPanel panel = new MyPanel();
		panel.setBounds(0, 0, 1200, 800);

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
