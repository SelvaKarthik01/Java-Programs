import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AnimationDemo extends Frame implements Runnable
{
 int x2,y2,tx2,ty2,x,y,tx,ty,x1,y1,tx1,ty1;
 AnimationDemo()
 {
  super("Bouncing Balls");
  x = 100;
  y = 100;
  x1 = 300;
  y1 = 250;
  x2 = 200;
  y2 = 150;
  tx2 = 1;
  ty2 = 1;
  tx1 = 1;
  ty1 = 1;
  tx = 1;
  ty = 1;
  setSize(500,400);
  setVisible(true);
  setBackground(Color.BLACK);
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  }
 );
  Thread t = new Thread(this);
  t.start();
 }
 public void paint(Graphics g)
 {
  g.setColor(Color.RED);
  g.fillOval(x,y,50,50);
  g.setColor(Color.BLUE);
  g.fillOval(x1,y1,50,50);
  g.setColor(Color.GREEN);
  g.fillOval(x2,y2,50,50);
 }
 public void run()
 {
  while(true)
  {
   x += tx;
   y += ty;
   x1 += tx1;
   y1 += ty1;
   x2 += tx2;
   y2 += ty2;
   if(x<0 || x>450)
   {
    tx = tx*-1;
   }
   if(x1<0 || x1>450)
   {
    tx1 = tx1*-1;
   }
   if(x2<0 || x2>450)
   {
    tx2 = tx2*-1;
   }
   if(y<0 || y>350)
   {
    ty = ty *-1;
   }
   if(y1<0 || y1>350)
   {
    ty1 = ty1 *-1;
   }
   if(y2<0 || y2>350)
   {
    ty2 = ty2 *-1;
   }
   repaint();
   try
   {
    Thread.sleep(5);
   }catch(Exception e){}
  }
 }
 public static void main(String args[])
 {
  new AnimationDemo();
 }
}
