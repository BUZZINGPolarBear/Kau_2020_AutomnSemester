import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

class ListFrame extends JFrame{
    private JList colorJList;
    private static final String[] colorNames = {"Black", "Red", "Green", "Blue", "Yellow", "White"};
    private static final Color[] colors = {Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.WHITE};
    public ListFrame()
    {
        super ("Choose Color");
        setLayout(new FlowLayout());
        Paint mainPaint = new Paint();

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(6);

        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        mainPaint.listPanel.add(new JScrollPane(colorJList));
        colorJList.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        Color color;
                        color = colors[colorJList.getSelectedIndex()];
                        PaintPanel paintPanel = new PaintPanel();
                        paintPanel.Color = color;
                    }
                }
        );
    }
}
