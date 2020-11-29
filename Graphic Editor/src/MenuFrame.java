import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MenuFrame extends JFrame{
    static JPanel radioBtnPanel = new JPanel();
    static JPanel listPanel = new JPanel();
    static PaintPanel paintPanel = new PaintPanel();

    void MenuFrame() {
        this.setTitle("Graphic Editor - 2017125064");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ListFrame listFrame = new ListFrame();
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
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
        JMenuBar mb = new JMenuBar();
        JMenuItem [] menuItem = new JMenuItem [3];
        String[] itemTitle = {"Save", "Load", "Exit"};
        JMenu fileMenu = new JMenu("FILE");

        MenuActionListener listener = new MenuActionListener();
        for(int i=0; i<menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            fileMenu.add(menuItem[i]);
        }
        mb.add(fileMenu);
        setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String cmd = e.getActionCommand();
            switch(cmd)
            {
                case "Save":
                    saveToPNG();
                    break;
                case "Load":
                    load();
                    break;
                case "Exit":
                    paintPanel.setVisible(false);
                    System.exit(0);
            }
        }
    }
    public void saveToPNG() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = filechooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File fileName = filechooser.getSelectedFile();
            try {
                ImageIO.write(paintPanel.bi, "PNG", fileName);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("Save Path: " + fileName.getPath());
        }
    }

    public void load()
    {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = filechooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File fileName = filechooser.getSelectedFile();
            try {
                paintPanel.objectImage = ImageIO.read(fileName);
                paintPanel.repaint();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("Load Path: " + fileName.getPath());
        }
    }

}
