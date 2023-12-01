import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ScrollBarFrame extends Frame implements AdjustmentListener
{
 Scrollbar red,green,blue;
 TextField tf;
 ScrollBarFrame()
 {
  super("SCROLL BAR");
  red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
  green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
  blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
  tf = new TextField(30);
  setLayout(null);
  red.setBounds(50,150,300,30);
  green.setBounds(50,200,300,30);
  blue.setBounds(50,250,300,30);
  tf.setBounds(50,50,300,50);
  add(red);
  add(green);
  add(blue);
  green.addAdjustmentListener(this);
  blue.addAdjustmentListener(this);
  red.addAdjustmentListener(this);
  add(tf);
  setSize(1920,1080);
  setVisible(true);
 }
 public void adjustmentValueChanged(AdjustmentEvent ae)
 {
  tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
 }
 public static void main(String args[])
 {
  new ScrollBarFrame();
 }
}
 
 
  