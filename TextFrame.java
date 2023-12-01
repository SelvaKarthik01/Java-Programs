import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ListFrame extends Frame
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
  add(l);
  add(c);
 }
 public static void main(String args[])
 {
  new ListFrame();
 }
}