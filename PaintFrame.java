/*
MouseEvent...MouseListener...MouseMotionListener....Color...Random

int getX() ->X coordinate Value of the Mouse
int getY() - Y coordinate Value of the Mouse
Point getPoint() - Get Both X and Y Coordinate 
getButton() - Which Button is Pressed {Button.Left,Button.Right}
getClickCount() - No. of Times the Button is Pressed

MouseListener 

mouseClicked() - Both Pressed and Released
mousePressed()
mouseReleased()
mouseEntered()
mouseExited()

MouseMotionListener

mouseDragged()
mouseMoved()

Classes: MotionAdapter  
         MouseMotionAdapter
         Color
         Color(int)..Color.red,Color.blue
         Graphics
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class PaintFrame extends JFrame implements MouseListener,MouseMotionListener
{
 int xPressed,yPressed;
 int xDragged,yDragged;
 Random r;
 PaintFrame()
 {
  setVisible(true);
  setSize(500,500);
  addMouseListener(this);
  addMouseMotionListener(this);
  r = new Random();
 }
 public void paint(Graphics g)
 {
  Graphics2D g1 = (Graphics2D)this.getGraphics();
  g1.setStroke(new BasicStroke(50));
  g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
  g.drawLine(xPressed,yPressed,xDragged,yDragged);
  xPressed = xDragged;
  yPressed = yDragged;
 }
 public void mouseClicked(MouseEvent me){};
 public void mousePressed(MouseEvent me)
 {
  xPressed=me.getX();
  yPressed=me.getY();
 };
 public void mouseReleased(MouseEvent me){};
 public void mouseEntered(MouseEvent me){};
 public void mouseExited(MouseEvent me){};
 public void mouseDragged(MouseEvent me)
 {
  xDragged = me.getX();
  yDragged = me.getY();
  repaint();
 }
 public void mouseMoved(MouseEvent me){};
 public static void main(String args[])
 {
  new PaintFrame();
 }
}




         


