import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;


//public class CheckBoxFrame extends JFrame {
public class RadioButtonFrame extends JFrame{
    private String Draw="Draw", Select="Select", Move="Move", Rect="Rect", Oval="Oval", Line="Line", Paint="Paint", Txt="Txt";
    private JRadioButton DrawBTN;
    private JRadioButton SelectBTN;
    private JRadioButton MoveBTN;
    private JRadioButton RectBTN;
    private JRadioButton OvalBTN;
    private JRadioButton LineBTN;
    private JRadioButton PaintBTN;
    private JRadioButton TxtBTN;
    private ButtonGroup radioGroup;
    static int size;

    // public CheckBoxFrame() {
    public RadioButtonFrame(){
        super("JCehckBox Test");
        setLayout( new FlowLayout() );
        MenuFrame mainPaint = new MenuFrame();

        DrawBTN = new JRadioButton("Draw", true);
        SelectBTN = new JRadioButton("Select", false);
        MoveBTN = new JRadioButton("Move", false);
        RectBTN = new JRadioButton("Rect", false);
        OvalBTN = new JRadioButton("Oval", false);
        LineBTN = new JRadioButton("Line", false);
        PaintBTN = new JRadioButton("Paint", false);
        TxtBTN = new JRadioButton("TEXT", false);

        mainPaint.radioBtnPanel.add(DrawBTN);
        mainPaint.radioBtnPanel.add(SelectBTN);
        mainPaint.radioBtnPanel.add(MoveBTN);
        mainPaint.radioBtnPanel.add(RectBTN);
        mainPaint.radioBtnPanel.add(OvalBTN);
        mainPaint.radioBtnPanel.add(LineBTN);
        mainPaint.radioBtnPanel.add(PaintBTN);
        mainPaint.radioBtnPanel.add(TxtBTN);


        radioGroup = new ButtonGroup();
        radioGroup.add(DrawBTN);
        radioGroup.add(SelectBTN);
        radioGroup.add(MoveBTN);
        radioGroup.add(RectBTN);
        radioGroup.add(OvalBTN);
        radioGroup.add(LineBTN);
        radioGroup.add(PaintBTN);
        radioGroup.add(TxtBTN);

        DrawBTN.addItemListener(
                new RadioButtonHandler(Draw) );
        SelectBTN.addItemListener(
                new RadioButtonHandler(Select) );
        MoveBTN.addItemListener(
                new RadioButtonHandler(Move) );
        RectBTN.addItemListener(
                new RadioButtonHandler(Rect) );
        OvalBTN.addItemListener(
                new RadioButtonHandler(Oval) );
        LineBTN.addItemListener(
                new RadioButtonHandler(Line) );
        PaintBTN.addItemListener(
                new RadioButtonHandler(Paint) );
        TxtBTN.addItemListener(
                new RadioButtonHandler(Txt) );
    }

    private class RadioButtonHandler implements ItemListener {
        private String selectedTool;
        private int size;
        PaintPanel paint = new PaintPanel();

        public RadioButtonHandler( String usrChoice ) {
            selectedTool = usrChoice;
        }
        public void itemStateChanged(ItemEvent event) {
            paint.selectedTool = this.selectedTool;
            if(selectedTool.equals(Rect)||selectedTool.equals(Oval)||selectedTool.equals(Line))
            {
                String str = JOptionPane.showInputDialog("Input size of selected shape size");
                size = Integer.parseInt(str);
                paint.size = this.size;
            }
        }

    }
}