import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PaintPanel extends JPanel {
    private int pointCount = 0;
    private Point[] points = new Point[1000000];
    private Color[] colorList = new Color[1000000];
    private int[] sizeList = new int[1000000];
    private int[] ShapeList = new int[1000000];
    static Color Color;
    static String selectedTool;
    static int size;

    public PaintPanel()
    {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    public void mouseDragged(MouseEvent event) {
                        if (pointCount < points.length) {
                            points[pointCount] = event.getPoint();
                            colorList[pointCount] = Color;
                            sizeList[pointCount] = size;
                            pointCount++;
                            repaint();
                        }
                    }
                }
        );
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    public void mouseClicked(MouseEvent event) {
                        if (pointCount < points.length) {
                            points[pointCount] = event.getPoint();
                            colorList[pointCount] = Color;
                            sizeList[pointCount] = size;
                            pointCount++;
                            repaint();
                        }
                    }
                }
        );
    }

    public void paintComponent(Graphics g)
    {
        int temp=0;
        super.paintComponent(g);
        for (int i = 0; i < pointCount; i++) {
            g.setColor(colorList[i]);
            temp = sizeList[i];
            if(temp==0) temp=3;
            if(selectedTool=="Draw") g.fillOval(points[i].x, points[i].y, temp, temp);
            else if(selectedTool=="Rect") g.drawRect(points[i].x, points[i].y, temp, temp);
            else if(selectedTool=="Oval") g.drawOval(points[i].x, points[i].y, temp, temp);
            else if(selectedTool=="Line") g.drawLine(points[i].x, points[i].y, temp, temp);
        }
    }
}