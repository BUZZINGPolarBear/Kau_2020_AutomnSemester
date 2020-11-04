import java.awt.*;
import javax.swing.*;

public class Paint {
    public static void main(String[] args)
    {
        JFrame application = new JFrame("Simple Paintbrush");
        JPanel list = new JPanel();

        ListFrame listFrame = new ListFrame();
        PaintPanel paintPanel = new PaintPanel();
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        application.add(paintPanel, BorderLayout.CENTER);

        application.add(new JLabel("Drag the moust to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.setSize(600, 600);
        listFrame.setSize(350, 150);
        radioButtonFrame.setSize(400,100);

        listFrame.setVisible(true);
        application.setVisible(true);
        radioButtonFrame.setVisible(true);
    }
}


