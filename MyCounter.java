import java.awt.*;
import java.awt.event.*;
class MyCounter extends Frame 
{
 Label lbl;
 Button b;
 int i = 0;
 MyCounter()
 {
  super("Counter");
  lbl = new Label("   ");
  b = new Button("Click");
  setLayout(new FlowLayout());
  add(lbl);
  add(b);
  setSize(500,500);
  setVisible(true);
  b.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    i += 1;
    lbl.setText(""+i);
   }
  }
  );
 }
 public static void main(String args[])
 {
  new MyCounter();
 }
}
   
