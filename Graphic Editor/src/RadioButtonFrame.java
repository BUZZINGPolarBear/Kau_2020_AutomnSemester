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
    private JRadioButton DrawBTN;
    private JRadioButton SelectBTN;
    private JRadioButton MoveBTN;
    private JRadioButton ShapesBTN;
    private JRadioButton PaintBTN;
    private JRadioButton TxtBTN;
    private ButtonGroup radioGroup;
    static int size;

    // public CheckBoxFrame() {
    public RadioButtonFrame(){
        super("JCehckBox Test");
        setLayout( new FlowLayout() );
        GraphicEditor mainPaint = new GraphicEditor();

        DrawBTN = new JRadioButton("Draw", true);
        SelectBTN = new JRadioButton("Select", false);
        MoveBTN = new JRadioButton("Move", false);
        ShapesBTN = new JRadioButton("Shapes", false);
        PaintBTN = new JRadioButton("Paint", false);
        TxtBTN = new JRadioButton("TEXT", false);

        mainPaint.radioBtnPanel.add(DrawBTN);
        mainPaint.radioBtnPanel.add(SelectBTN);
        mainPaint.radioBtnPanel.add(MoveBTN);
        mainPaint.radioBtnPanel.add(ShapesBTN);
        mainPaint.radioBtnPanel.add(PaintBTN);
        mainPaint.radioBtnPanel.add(TxtBTN);


        radioGroup = new ButtonGroup();
        radioGroup.add(DrawBTN);
        radioGroup.add(SelectBTN);
        radioGroup.add(MoveBTN);
        radioGroup.add(PaintBTN);
        radioGroup.add(TxtBTN);

        DrawBTN.addItemListener(
                new RadioButtonHandler(3) );
        SelectBTN.addItemListener(
                new RadioButtonHandler(5) );
        MoveBTN.addItemListener(
                new RadioButtonHandler(8) );
        ShapesBTN.addItemListener(
                new RadioButtonHandler(12) );
        PaintBTN.addItemListener(
                new RadioButtonHandler(16) );
        TxtBTN.addItemListener(
                new RadioButtonHandler(20) );
    }

    private class RadioButtonHandler implements ItemListener {
        private int size;
        PaintPanel paint = new PaintPanel();

        public RadioButtonHandler( int usrsize ) {
            size = usrsize;
        }
        public void itemStateChanged(ItemEvent event) {
            paint.size = this.size;
        }

    }
}