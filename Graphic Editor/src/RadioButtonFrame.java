import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;


//public class CheckBoxFrame extends JFrame {
public class RadioButtonFrame extends JFrame{
    private String Draw="Draw", Select="Select", Delete="Delete", Rect="Rect", Oval="Oval", Line="Line", Resize="Resize", Txt="Txt";
    private JRadioButton DrawBTN;
    private JRadioButton SelectBTN;
    private JRadioButton DeleteBTN;
    private JRadioButton RectBTN;
    private JRadioButton OvalBTN;
    private JRadioButton LineBTN;
    private JRadioButton ResizeBTN;
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
        RectBTN = new JRadioButton("Rect", false);
        OvalBTN = new JRadioButton("Oval", false);
        LineBTN = new JRadioButton("Line", false);
        ResizeBTN = new JRadioButton("Resize", false);
        DeleteBTN = new JRadioButton("Delete", false);
        TxtBTN = new JRadioButton("TEXT", false);

        mainPaint.radioBtnPanel.add(DrawBTN);
        mainPaint.radioBtnPanel.add(SelectBTN);
        mainPaint.radioBtnPanel.add(RectBTN);
        mainPaint.radioBtnPanel.add(OvalBTN);
        mainPaint.radioBtnPanel.add(LineBTN);
        mainPaint.radioBtnPanel.add(ResizeBTN);
        mainPaint.radioBtnPanel.add(DeleteBTN);
        mainPaint.radioBtnPanel.add(TxtBTN);


        radioGroup = new ButtonGroup();
        radioGroup.add(DrawBTN);
        radioGroup.add(SelectBTN);
        radioGroup.add(RectBTN);
        radioGroup.add(OvalBTN);
        radioGroup.add(LineBTN);
        radioGroup.add(ResizeBTN);
        radioGroup.add(DeleteBTN);
        radioGroup.add(TxtBTN);

        DrawBTN.addItemListener(
                new RadioButtonHandler(Draw) );
        SelectBTN.addItemListener(
                new RadioButtonHandler(Select) );
        DeleteBTN.addItemListener(
                new RadioButtonHandler(Delete) );
        RectBTN.addItemListener(
                new RadioButtonHandler(Rect) );
        OvalBTN.addItemListener(
                new RadioButtonHandler(Oval) );
        LineBTN.addItemListener(
                new RadioButtonHandler(Line) );
        ResizeBTN.addItemListener(
                new RadioButtonHandler(Resize) );
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

        }

    }
}