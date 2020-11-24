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
    public static final String[] colorNames = {"Black", "Red", "Green", "Blue", "Yellow", "White"};
    public static final Color[] colors = {Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.WHITE};
    public ListFrame()
    {
        super ("Choose Color");
        setLayout(new FlowLayout());
        MenuFrame main = new MenuFrame();

        textArea = new JTextArea();
        textField = new JTextField("Set your size here",10);
        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(6);

        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        paintPanel.setLayout(new BorderLayout());
        paintPanel.add(textArea,"North");
        paintPanel.add(textField,"Center");
        paintPanel.add(new JScrollPane(colorJList),"South");
        main.listPanel.add(paintPanel);

        textArea.setText("Thickness: 3px");

        colorJList.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        Color color;
                        color = colors[colorJList.getSelectedIndex()];
                        paintPanel.Color = color;
                    }
                }
        );

        textField.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        paintPanel.size = Integer.parseInt(textField.getText());
                        textArea.setText("Thickness: "+Integer.parseInt(textField.getText())+"px");
                    }
                }
        );
    }
}