import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame{

    void MenuFrame(){
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
    }

}
