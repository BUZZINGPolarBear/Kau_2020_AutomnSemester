import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame{
    static JPanel radioBtnPanel = new JPanel();
    static JPanel listPanel = new JPanel();

    void MenuFrame() {
        this.setTitle("Graphic Editor - 2017125064");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ListFrame listFrame = new ListFrame();
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        PaintPanel paintPanel = new PaintPanel();
        MenuFrame menuFrame = new MenuFrame();

        paintPanel.setBackground(Color.WHITE);

        this.add(radioBtnPanel, BorderLayout.NORTH);
        this.add(listPanel,BorderLayout.WEST);
        this.add(paintPanel, BorderLayout.CENTER);
        this.add(new JLabel("Drag mouse to draw"), BorderLayout.SOUTH);

        CreateMenu();

        this.setVisible(true);
    }

    public void CreateMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu SourceMenu = new JMenu("Source");

        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Load"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Exit"));
        SourceMenu.add(new JMenuItem("Img Load From.."));

        menuBar.add(fileMenu);
        menuBar.add(SourceMenu);

        this.setJMenuBar(menuBar);
    }

}
