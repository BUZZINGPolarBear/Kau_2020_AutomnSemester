import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PaintPanel extends JPanel
{
    private int pointCount = 0, shapeCount=0;
    private Point[] points = new Point[1000000];
    private Color[] colorList = new Color[1000000];
    private int[] sizeList = new int[1000000];
    private String[] shapeList = new String[1000000];
    private ShapeLocation[] shapeLocationList = new ShapeLocation[1000000];
    static Color Color;
    static String selectedTool="Draw";
    ShapeLocation shapeLocation = new ShapeLocation();
    static int size;

    public PaintPanel()
    {
        MouseHandler handler = new MouseHandler();
        super.addMouseListener(handler);
        super.addMouseMotionListener(handler);
    }

    public class ShapeLocation
    {
        public int x,y,x2,y2;
        public void setStartLocation(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public void setEndLocation(int x, int y)
        {
            this.x2 = x;
            this.y2 = y;
        }
        public int[] getShapeLocation()
        {
            int[] startEndArr = new int[]{x, y, x2, y2};
            return startEndArr;
        }
    }
    private class MouseHandler implements MouseListener,
            MouseMotionListener
    {
        @Override
        public void mouseDragged(MouseEvent event)
        {
            if (pointCount < points.length && selectedTool == "Draw")
            {
                points[pointCount] = event.getPoint();
                colorList[pointCount] = Color;
                sizeList[pointCount] = size;
                shapeList[pointCount] = selectedTool;
                pointCount++;
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
        @Override
        public void mouseClicked(MouseEvent event) {
            if (pointCount < points.length) {
                points[pointCount] = event.getPoint();
                colorList[pointCount] = Color;
                shapeList[pointCount] = selectedTool;
                sizeList[pointCount] = size;
                pointCount++;
                repaint();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x,y;
            x = e.getX();
            y = e.getY();
            ShapeLocation newShapeLocation = new ShapeLocation();
            if(selectedTool=="Rect" || selectedTool=="Oval" || selectedTool=="Line")
            {
                newShapeLocation.setStartLocation(x, y);
                shapeLocationList[shapeCount++]=newShapeLocation;
            }
            System.out.printf("%d    %d    %d\n",shapeCount, x, y);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            int x, y;
            x = e.getX();
            y = e.getY();
            ShapeLocation newShapeLocation = new ShapeLocation();
            if(selectedTool=="Rect" || selectedTool=="Oval" || selectedTool=="Line")
            {
                newShapeLocation.setEndLocation(x, y);
                shapeLocationList[shapeCount++]=newShapeLocation;
            }
            System.out.printf("%d    %d    %d\n\n",shapeCount, x, y);
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public void paintComponent(Graphics g)
    {
        int temp=0;
        super.paintComponent(g);
        for (int i = 0; i < pointCount; i++)
        {
            g.setColor(colorList[i]);
            temp = sizeList[i];

            if(temp==0) temp=3;
            if(shapeList[i]=="Draw") g.fillOval(points[i].x, points[i].y, temp, temp);
        }
        for (int i=0; i<shapeCount; i+=2)
        {
            g.setColor(java.awt.Color.BLACK);
            int shapeStartLocaInfo[] = new int[4];
            int shapeEndLocaInfo[] = new int[4];
            shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
            shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
            g.drawRect(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2]-shapeStartLocaInfo[0], shapeEndLocaInfo[3]-shapeStartLocaInfo[1]);
        }
    }
}

