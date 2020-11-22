import java.awt.*;
import javax.swing.*;

public class GraphicEditor {
    static JFrame application = new JFrame("Simple Paintbrush");
    static JPanel radioBtnPanel = new JPanel();
    static JPanel listPanel = new JPanel();

    public static void main(String[] args)
    {
        SimpleDrawingTool();
    }

    public static void SimpleDrawingTool()
    {
        ListFrame listFrame = new ListFrame();
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        PaintPanel paintPanel = new PaintPanel();
        MenuFrame menuFrame = new MenuFrame();

        paintPanel.setBackground(Color.WHITE);

        application.add(menuFrame,BorderLayout.NORTH);
        application.add(radioBtnPanel, BorderLayout.NORTH);
        application.add(listPanel,BorderLayout.WEST);
        application.add(paintPanel, BorderLayout.CENTER);
        application.add(new JLabel("Drag mouse to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.setSize(600, 600);
        menuFrame.setSize(600,200);

        listFrame.setVisible(false);
        menuFrame.setVisible(true);
        application.setVisible(true);
        radioButtonFrame.setVisible(false);
    }
}