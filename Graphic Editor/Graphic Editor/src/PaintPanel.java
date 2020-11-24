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
    private Color[] shapeColorList = new Color[1000000];
    private int[] sizeList = new int[1000000];
    private String[] shapeList = new String[1000000];
    private ShapeLocation[] shapeLocationList = new ShapeLocation[1000000];
    static Color Color;
    static String selectedTool="Draw";//Initial value
    ShapeLocation shapeLocation = new ShapeLocation();
    static int size, flagForNewShapeLocation=0;

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
                //shapeList[pointCount] = selectedTool;
                pointCount++;
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
        @Override
        public void mouseClicked(MouseEvent e) {
            if(selectedTool=="Select")
            {
                int x= e.getX(), y = e.getY();
                if(flagForNewShapeLocation==0)
                {
                    for (int i=0; i<shapeCount; i+=2)
                    {
                        int shapeStartLocaInfo[] = new int[4];
                        int shapeEndLocaInfo[] = new int[4];
                        String nowShape = shapeList[i];
                        int savedShapeLocation_x, savedShapeLocation_y, savedShapeLocation_x2, savedShapeLocation_y2;
                        shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
                        shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
                        savedShapeLocation_x = shapeStartLocaInfo[0]; savedShapeLocation_y = shapeStartLocaInfo[1];
                        savedShapeLocation_x2 = shapeEndLocaInfo[2]; savedShapeLocation_y2 = shapeEndLocaInfo[3];
                        if(savedShapeLocation_x<=x && x<=savedShapeLocation_x2 && savedShapeLocation_y <= y && y <= savedShapeLocation_y2)
                        {
                            String str = JOptionPane.showInputDialog(shapeList[i]+"shape Selected. What do you want? \n1. Move 2. Change Color 3. Copy&Paste");
                            int selected = Integer.parseInt(str);
                            if(selected==2)
                            {
                                //String str = JOptionPane.showInputDialog("Chang color to...\n");
                               // shapeColorList[i] = color;
                            }
                            flagForNewShapeLocation=1;
                        }
                    }
                }
                if(flagForNewShapeLocation==1)
                {
                    flagForNewShapeLocation=0;

                }


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
                shapeList[shapeCount]=selectedTool;
                shapeColorList[shapeCount] = Color;
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
            System.out.printf("%d    %d    %d     %s\n\n",shapeCount, x, y, Color);
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public class ShapeReconstructor
    {
        private int x, y, x2, y2;
        private int new_X, new_Y;
        private int selected=0; //1:Move, 1. Move 2. Change Color 3. Copy&Paste

        public ShapeReconstructor(int inpt_x, int inpt_y, int inpt_x2, int inpt_y2, int inpt_selected)
        {
            this.x = inpt_x;
            this.y = inpt_y;
            this.x2 = inpt_x2;
            this.y2 = inpt_y2;
        }

        public void setNewLocation(int inpt_new_X, int inpt_new_Y)
        {
            this.new_X = inpt_new_X;
            this.new_Y = inpt_new_Y;
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
            g.fillOval(points[i].x, points[i].y, temp, temp);
        }
        for (int i=0; i<shapeCount; i+=2)
        {
            g.setColor(shapeColorList[i]);
            System.out.println(shapeColorList[i]);
            int shapeStartLocaInfo[] = new int[4];
            int shapeEndLocaInfo[] = new int[4];
            String nowShape = shapeList[i];
            shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
            shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
            if(nowShape=="Rect") g.fillRect(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2]-shapeStartLocaInfo[0], shapeEndLocaInfo[3]-shapeStartLocaInfo[1]);
            else if(nowShape=="Oval") g.fillOval(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2]-shapeStartLocaInfo[0], shapeEndLocaInfo[3]-shapeStartLocaInfo[1]);
            else if(nowShape=="Line") g.drawLine(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2], shapeEndLocaInfo[3]);
        }
    }
}

