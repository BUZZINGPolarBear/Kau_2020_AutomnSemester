/*import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame{
    private JRadioButton px3BTN;
    private JRadioButton px5BTN;
    private JRadioButton px8BTN;
    private JRadioButton px12BTN;
    private JRadioButton px16BTN;
    private JRadioButton px20BTN;
    private ButtonGroup radioGroup;
    static int size;

    public RadioButtonFrame()
    {
        super("Choose Size");
        setLayout(new FlowLayout());

        px3BTN = new JRadioButton("3px", true);
        px5BTN = new JRadioButton("5px", false);
        px8BTN = new JRadioButton("8px", false);
        px12BTN = new JRadioButton("12px", false);
        px16BTN = new JRadioButton("16px", false);
        px20BTN = new JRadioButton("20px", false);

        add(px3BTN);
        add(px5BTN);
        add(px8BTN);
        add(px12BTN);
        add(px16BTN);
        add(px20BTN);

        radioGroup = new ButtonGroup();
        radioGroup.add(px3BTN);
        radioGroup.add(px5BTN);
        radioGroup.add(px8BTN);
        radioGroup.add(px12BTN);
        radioGroup.add(px16BTN);
        radioGroup.add(px20BTN);

        px3BTN.addItemListener(
                new RadioButtonHandler(3) );
        px5BTN.addItemListener(
                new RadioButtonHandler(5) );
        px8BTN.addItemListener(
                new RadioButtonHandler(8) );
        px12BTN.addItemListener(
                new RadioButtonHandler(12) );
        px16BTN.addItemListener(
                new RadioButtonHandler(16) );
        px20BTN.addItemListener(
                new RadioButtonHandler(20) );
    }

    private class RadioButtonHandler implements ItemListener
    {
        int size;

        public RadioButtonHandler(int usrsize)
        {
            size = usrsize;
        }

        public void itemSateChanged(ItemEvent event)
        {
            PaintPanel paint = new PaintPanel();
            paint.size = this.size;
        }
    }
}*/

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


//public class CheckBoxFrame extends JFrame {
public class RadioButtonFrame extends JFrame{
    // private JCheckBox boldJCheckBox;
    // private JCheckBox italicJCheckBox;
    private JRadioButton px3BTN;
    private JRadioButton px5BTN;
    private JRadioButton px8BTN;
    private JRadioButton px12BTN;
    private JRadioButton px16BTN;
    private JRadioButton px20BTN;
    private ButtonGroup radioGroup;
    static int size;


    // public CheckBoxFrame() {
    public RadioButtonFrame(){
        super("JCehckBox Test");
        setLayout( new FlowLayout() );

        px3BTN = new JRadioButton("3px", true);
        px5BTN = new JRadioButton("5px", false);
        px8BTN = new JRadioButton("8px", false);
        px12BTN = new JRadioButton("12px", false);
        px16BTN = new JRadioButton("16px", false);
        px20BTN = new JRadioButton("20px", false);
        add(px3BTN);
        add(px5BTN);
        add(px8BTN);
        add(px12BTN);
        add(px16BTN);
        add(px20BTN);

        radioGroup = new ButtonGroup();
        radioGroup.add(px3BTN);
        radioGroup.add(px5BTN);
        radioGroup.add(px8BTN);
        radioGroup.add(px12BTN);
        radioGroup.add(px16BTN);
        radioGroup.add(px20BTN);


        px3BTN.addItemListener(
                new RadioButtonHandler(3) );
        px5BTN.addItemListener(
                new RadioButtonHandler(5) );
        px8BTN.addItemListener(
                new RadioButtonHandler(8) );
        px12BTN.addItemListener(
                new RadioButtonHandler(12) );
        px16BTN.addItemListener(
                new RadioButtonHandler(16) );
        px20BTN.addItemListener(
                new RadioButtonHandler(20) );



    }

    //private class CheckBoxHandler implements ItemListener {
    private class RadioButtonHandler implements ItemListener {
        private int size;

        public RadioButtonHandler( int usrsize ) {
            size = usrsize;
        }

        public void itemStateChanged(ItemEvent event) {
            PaintPanel paint = new PaintPanel();
            paint.size = this.size;
        }

    }
}
