
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class PaintFrame extends JFrame implements MouseListener,MouseMotionListener
{
 int xPressed,yPressed,xDragged,yDragged;
 PaintFrame()
 {
  super("PAINT");
  setSize(1000,1000);
  setVisible(true);
  addMouseListener(this);
  addMouseMotionListener(this);
 } 
 public void paint(Graphics g)
 {
  g.drawLine(xPressed,yPressed,xDragged,yDragged);
  xPressed = xDragged;
  yPressed = yDragged;
  repaint();
 }
 public void mouseEntered(MouseEvent me){}
 public void mouseExited(MouseEvent me){}
 public void mouseClicked(MouseEvent me){}
 public void mousePressed(MouseEvent me)
 {
  xPressed = me.getX();
  yPressed = me.getY();
 }
 public void mouseReleased(MouseEvent me){};
 public void mouseMoved(MouseEvent me){};
 public void mouseDragged(MouseEvent me)
 {
  xDragged = me.getX();
  yDragged = me.getY();
 }
}
class LoginFrame extends Frame implements ActionListener
{
 Label l1,l2,temp;
 TextField tf1,tf2;
 Button b1,b2;
 LoginFrame() 
 {
  super("LOGIN PAGE");
  setLayout(null);
  temp = new Label(" ");
  l1 = new Label("Username : ");
  l2 = new Label("Password : ");
  tf1 = new TextField(120);
  tf2 = new TextField(120);
  tf2.setEchoChar('*');
  b1 = new Button("Submit");
  b1.addActionListener(this);
  b2 = new Button("Cancel");
  setSize(500,500);
  setVisible(true);
  l1.setBounds(80,100,100,20);
  l2.setBounds(80,150,100,20);
  temp.setBounds(350,350,350,350);
  tf1.setBounds(200,100,120,20);
  tf2.setBounds(200,150,120,20);
  b1.setBounds(130,300,100,50);
  b2.setBounds(320,300,100,50);
  add(tf1);
  add(tf2);
  add(l1);
  add(l2);
  add(temp);
  add(b1);
  add(b2);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(tf1.getText().equals("Selva Karthik") && tf2.getText().equals("ABC123"))
  {
   temp.setText("New Page");
   new PaintFrame();
  }
  else
  {
   temp.setText("Invalid Credentials !!");
  }
 }
 public static void main(String args[])
 {
  new LoginFrame();
 }
}