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
		setTitle("G�� ��Ŀ���� - ���Ӽ���");
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
			img = ImageIO.read(new File("./image/how.png"));
		} catch (IOException e) {
			System.out.println("�̹��� �ҷ����� ����");
			System.exit(0);
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
				// ���콺�� �ö�����
				exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				// ���콺 �������� ��
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
