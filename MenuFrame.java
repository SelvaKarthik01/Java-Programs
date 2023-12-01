import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuFrame extends Frame
{
 Menu file,sub;
 MenuItem open,save,close,closeall;
 CheckboxMenuItem auto;
 TextField tf;
 MenuFrame()
 {
  super("Menu Frame");
  open = new MenuItem("Open");
  save = new MenuItem("Save");
  close = new MenuItem("Close");
  closeall = new MenuItem("Close All");
  auto = new CheckboxMenuItem("Auto Save");
  file = new Menu("File");
  sub = new Menu("Close");
  file.add(open);
  file.add(save);
  file.add(sub);
  file.add(auto);
  sub.add(close);
  sub.add(closeall);
  MenuBar mb = new MenuBar();
  mb.add(file);
  setMenuBar(mb);
  tf = new TextField(20);
  setLayout(new FlowLayout());
  add(tf);
  setSize(500,500);
  setVisible(true);
  open.addActionListener((ActionEvent ae)->tf.setText("Open"));
  save.addActionListener((ActionEvent ae)->tf.setText("Save"));
  close.addActionListener((ActionEvent ae)->tf.setText("Close"));
  closeall.addActionListener((ActionEvent ae)->tf.setText("Close All"));
  auto.addItemListener((ItemEvent IE)->tf.setText("Auto ON"));
 }
 public static void main(String args[])
 {
  new MenuFrame();
 }
}
  