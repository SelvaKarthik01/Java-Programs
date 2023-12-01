import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class KeyFrame extends Frame implements KeyListener,WindowListener
{
 Label l1,l2,l3,l4;
 KeyFrame()
 {
  super("Key Frame");
  l1 = new Label("");
  l2 = new Label("");
  l3 = new Label("");
  l4 = new Label("");
  l1.setBounds(30,50,200,20);
  l2.setBounds(30,90,200,20);
  l3.setBounds(30,120,200,20);
  l4.setBounds(30,150,200,20);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  addKeyListener(this);
  addWindowListener(this);
  setLayout(null);
  setSize(500,500);
  setVisible(true);
 }
 public void keyPressed(KeyEvent ke)
 {
  l1.setText("Key is been Pressed !!!");
  l2.setText(" ");
 }
 public void keyReleased(KeyEvent ke)
 {
  l2.setText("Key is been Released !!");
  l1.setText(" ");
  l3.setText(" ");
  l4.setText(" ");
 }
 public void keyTyped(KeyEvent ke)
 {
  l3.setText("KeyTyped");
  l4.setText(new Date(ke.getWhen())+"");
 }
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
 public void windowOpened(WindowEvent we){}
 public void windowClosed(WindowEvent we){}
 public void windowActivated(WindowEvent we){}
 public void windowDeactivated(WindowEvent we){}
 public void windowIconified(WindowEvent we){}
 public void windowDeiconified(WindowEvent we){}
 
 public static void main(String args[])
 {
  new KeyFrame();
 }
}
