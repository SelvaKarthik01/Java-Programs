import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ListFrame extends Frame implements ItemListener,ActionListener
{
 List l;
 Choice c;
 TextArea ta;
 ListFrame()
 {
  super("List Frame");
  l = new List(4,true);
  c = new Choice();
  ta = new TextArea(20,30);
  setLayout(new FlowLayout());
  l.add("Monday");
  l.add("Tuesday");
  l.add("Wednesday");
  l.add("Thursday");
  l.add("Friday");
  l.add("Saturday");
  l.add("Sunday");
  c.add("January");
  c.add("Febrauary");
  c.add("March");
  c.add("April");
  c.addItemListener(this);
  l.addItemListener(this);
  l.addActionListener(this);
  add(l);
  add(c);
  add(ta);
  setSize(1920,1080);
  setVisible(true);
 }
 public void itemStateChanged(ItemEvent ie)
 {
  if(ie.getSource()==l)
  {
   ta.setText(l.getSelectedItem());
  }
  else
  {
   ta.setText(c.getSelectedItem());
  }
 }
 public void actionPerformed(ActionEvent ae)
 {
  String list[] = l.getSelectedItems();
  String txt = "";
  for(String x:list)
  {
   txt += x+"\n";
  }
  ta.setText(txt);
 }
 public static void main(String args[])
 {
  new ListFrame();
 }
}