import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

class ListFrame extends JFrame{
    private JList colorJList;
    private JTextField textField;
    private JTextArea textArea;
    public static  PaintPanel paintPanel = new PaintPanel();
    public Button colorBTN = new Button("Set Color");
    public ListFrame()
    {
        super ("Choose Color");
        setLayout(new FlowLayout());
        MenuFrame main = new MenuFrame();

        textArea = new JTextArea();
        textField = new JTextField("Set your size here",10);
        colorBTN.setSize(10,5);

        paintPanel.setLayout(new BorderLayout());
        paintPanel.add(textArea,"North");
        paintPanel.add(textField,"Center");
        paintPanel.add(colorBTN,"South");
        main.listPanel.add(paintPanel);

        textArea.setText("Thickness: 3px");


        textField.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        paintPanel.size = Integer.parseInt(textField.getText());
                        textArea.setText("Thickness: "+Integer.parseInt(textField.getText())+"px");
                    }
                }
        );

        colorBTN.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        RGBPicker rgbPicker = new RGBPicker();
                        rgbPicker.run();
                    }
                }
        );
    }
}