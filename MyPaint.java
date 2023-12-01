import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyPaint extends Frame implements AdjustmentListener
{
 Scrollbar sb;
 int x,y,color=0;
 MyPaint()
 {
  super("My Paint");
  sb = new Scrollbar(Scrollbar.HORIZONTAL,0,100,0,255);
  sb.setBounds(400,400,100,100);
  add(sb);
  setLayout(new FlowLayout());
  addMouseListener(new MouseAdapter()
  {
   public void mouseClicked(MouseEvent me)
   {
    x = me.getX();
    y = me.getY();
    repaint();
   }
  }
 );
 addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent we)
  {
   System.exit(0);
  }
 }
 );
 setSize(500,500);
 setVisible(true);
 }
 public void adjustmentValueChanged(AdjustmentEvent ae)
 {
  color = sb.getValue();
 }
 public void paint(Graphics g)
 {
  g.setColor(new Color(color,color,color));
  g.drawLine(x,y,50,50);
 }

 public static void main(String args[])
 {
  new MyPaint();
 }
}