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
    static Color Color, newColor;
    static String selectedTool="Draw";//Initial value
    static RGBPicker rgbPicker = new RGBPicker();
    ShapeLocation shapeLocation = new ShapeLocation();
    static int size, flagForNewShapeLocation=0, selected=0, originalShapeIndex=0;
    static int savedShapeLocation_x, savedShapeLocation_y, savedShapeLocation_x2, savedShapeLocation_y2;

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
                colorList[pointCount] = rgbPicker.getRGB();
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
            int x = e.getX(), y = e.getY(), i;
            int[] shapeStartLocaInfo = new int[4];
            int[] shapeEndLocaInfo = new int[4];
            ShapeLocation newShapeLocation = new ShapeLocation();
            Color savedShapeColor;
            String savedShapeType;
            if(selectedTool=="Select")
            {
                if(flagForNewShapeLocation==0)
                {
                    for (i=0; i<shapeCount; i+=2)
                    {

                        shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
                        shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
                        savedShapeLocation_x = shapeStartLocaInfo[0]; savedShapeLocation_y = shapeStartLocaInfo[1];
                        savedShapeLocation_x2 = shapeEndLocaInfo[2]; savedShapeLocation_y2 = shapeEndLocaInfo[3];
                        savedShapeColor = shapeColorList[i];

                        if(savedShapeLocation_x<=x && x<=savedShapeLocation_x2 && savedShapeLocation_y <= y && y <= savedShapeLocation_y2)
                        {
                            String str = JOptionPane.showInputDialog(shapeList[i]+"shape Selected. What do you want? \n1. Move 2. Change Color 3. Copy&Paste");
                            selected = Integer.parseInt(str);
                            originalShapeIndex = i;
                            break;
                        }
                    }
                    if(selected==2)
                    {//Change Color
                        shapeColorList[originalShapeIndex] = rgbPicker.getRGB();
                        repaint();
                    }
                    else
                    {
                        flagForNewShapeLocation=1;
                        return;
                    }
                }
                if(flagForNewShapeLocation==1)
                {//Move
                    System.out.println("X: "+x+"  Y: "+y);
                    flagForNewShapeLocation=0;
                    int width = savedShapeLocation_x2-savedShapeLocation_x, height = savedShapeLocation_y2-savedShapeLocation_y;
                    int new_x = x-(width/2), new_y = y-(height/2);
                    int new_x2 = x+(width/2), new_y2 = y+(height/2);
                   if(selected==1)
                   {
                        newShapeLocation.setStartLocation(new_x, new_y);
                        shapeLocationList[originalShapeIndex++] = newShapeLocation;

                        newShapeLocation.setEndLocation(new_x2, new_y2);
                        shapeLocationList[originalShapeIndex] = newShapeLocation;

                        repaint();
                   }
                   else if(selected == 3)
                   {
                       newShapeLocation.setStartLocation(new_x, new_y);
                       shapeColorList[shapeCount] = shapeColorList[originalShapeIndex];
                       shapeList[shapeCount] = shapeList[originalShapeIndex];
                       shapeLocationList[shapeCount++] = newShapeLocation;

                       newShapeLocation.setEndLocation(new_x2, new_y2);
                       shapeLocationList[shapeCount++] = newShapeLocation;
                       repaint();
                       return;
                   }

                }


            }
            else if(selectedTool=="Delete")
            {//Delete
                for (i=0; i<shapeCount; i+=2)
                {

                    shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
                    shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
                    savedShapeLocation_x = shapeStartLocaInfo[0]; savedShapeLocation_y = shapeStartLocaInfo[1];
                    savedShapeLocation_x2 = shapeEndLocaInfo[2]; savedShapeLocation_y2 = shapeEndLocaInfo[3];
                    savedShapeColor = shapeColorList[i];

                    if(savedShapeLocation_x<=x && x<=savedShapeLocation_x2 && savedShapeLocation_y <= y && y <= savedShapeLocation_y2)
                    {
                        JOptionPane.showMessageDialog(null, shapeList[i]+"shape Deleted.");
                        newShapeLocation.setStartLocation(-10, -10);
                        shapeLocationList[i++] = newShapeLocation;
                        newShapeLocation.setEndLocation(-10, -10);
                        shapeLocationList[i] = newShapeLocation;
                        originalShapeIndex = i;
                        repaint();
                        return;
                    }
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
                shapeColorList[shapeCount] = rgbPicker.getRGB();
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
            System.out.printf("%d    %d    %d\n\n", shapeCount, x, y);
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
            g.fillOval(points[i].x, points[i].y, temp, temp);
        }
        for (int i=0; i<shapeCount; i+=2)
        {
            g.setColor(shapeColorList[i]);
            int shapeStartLocaInfo[] = new int[4];
            int shapeEndLocaInfo[] = new int[4];
            String nowShape = shapeList[i];
            shapeStartLocaInfo = shapeLocationList[i].getShapeLocation();
            shapeEndLocaInfo = shapeLocationList[i+1].getShapeLocation();
            if(shapeStartLocaInfo[0]==-10) continue;
            else if(nowShape=="Rect") g.fillRect(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2]-shapeStartLocaInfo[0], shapeEndLocaInfo[3]-shapeStartLocaInfo[1]);
            else if(nowShape=="Oval") g.fillOval(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2]-shapeStartLocaInfo[0], shapeEndLocaInfo[3]-shapeStartLocaInfo[1]);
            else if(nowShape=="Line") g.drawLine(shapeStartLocaInfo[0], shapeStartLocaInfo[1], shapeEndLocaInfo[2], shapeEndLocaInfo[3]);
        }
    }
}

