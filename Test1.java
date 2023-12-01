import java.awt.*;
import java.awt.event.*;
class Test1 extends Frame 
{
 Label l1,l2;
 TextField tf;
 Test1()
 { 
  super("TEXTFIELD");
  setLayout(new FlowLayout());
  l1 = new Label("No Text is been Entered");
  l2 = new Label("Enter Key is not Hit");
  tf = new TextField(20);
  tf.addTextListener(new TextListener()
  {
   public void textValueChanged(TextEvent te)
   {
    l1.setText(tf.getText());
    l2.setText(tf.getText());
   }
  });
  add(l1);
  add(tf);
  add(l2);
  setSize(500,500);
  setVisible(true);
 }
 public static void main(String args[])
 {
  new Test1();
 }
}
 
 