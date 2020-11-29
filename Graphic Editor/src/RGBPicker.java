import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RGBPicker extends JFrame {
    public static  PaintPanel paintPanel = new PaintPanel();
    private JPanel contentPane;
    private static int closeFlag=0;
    private static Color color, finalColor;
    private static RGBPicker frame = new RGBPicker();

    public void run() {
        try {
            if(closeFlag==0) {
                frame.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Color getRGB()
    {
        return finalColor;
    }

    public RGBPicker() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 769, 292);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextArea cta = new JTextArea();
        cta.setBounds(12, 29, 288, 155);
        contentPane.add(cta);

        JSlider Rslider = new JSlider();
        Rslider.setPaintTicks(true);
        Rslider.setForeground(Color.RED);
        Rslider.setBackground(Color.RED);
        Rslider.setValue(0);
        Rslider.setMaximum(255);
        Rslider.setBounds(325, 45, 416, 26);
        contentPane.add(Rslider);

        JSlider Gslider = new JSlider();
        Gslider.setPaintTicks(true);
        Gslider.setBackground(Color.GREEN);
        Gslider.setMaximum(255);
        Gslider.setValue(0);
        Gslider.setBounds(325, 94, 416, 26);
        contentPane.add(Gslider);

        JSlider Bslider = new JSlider();
        Bslider.setPaintTicks(true);

        Bslider.setBackground(Color.BLUE);
        Bslider.setForeground(Color.BLUE);
        Bslider.setMaximum(255);
        Bslider.setValue(0);
        Bslider.setBounds(325, 147, 416, 26);
        contentPane.add(Bslider);

        JButton appyBTN = new JButton("Appy");
        appyBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                finalColor = new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue());
                System.out.printf("Final Color: ");
                System.out.println(String.valueOf(finalColor));
                frame.setVisible(false);
            }
        });
        appyBTN.setBounds(325, 196, 97, 23);
        contentPane.add(appyBTN);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(12, 196, 288, 23);
        contentPane.add(textArea);

        Rslider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);

            }
        });

        Gslider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
            }
        });

        Bslider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
            }
        });
    }
}