import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class TimerGUI
{
 Random r = new Random();
 int x=0,y=0;
 JFrame jf;
 JLabel jl;
 JToggleButton jt;
 JCheckBox cb1,cb2;
 TimerGUI()
 {
  
  jf = new JFrame("Timer Project");
  JTabbedPane tb = new JTabbedPane();
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  tb.addTab("Hey",p1);
  tb.add("Hi",p2);
  jf.add(tb);
  cb1 = new JCheckBox("CSE",false);
  cb2 = new JCheckBox("IT",false);
  cb1.setBounds(250,100,100,50);
  cb2.setBounds(350,100,100,50);
  p1.add(cb1);
  p1.add(cb2);
  jl = new JLabel("SASTRA");
  jl.setFont(new Font("Arial",Font.BOLD,25));
  p1.add(jl);
  jt = new JToggleButton("Click");
  p1.add(jt);
  jt.setBounds(100,100,100,50);
  jt.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent ie)
   {
    if(ItemEvent.isSelected())
    {
     jf.setTitle("ADD");
    }
    else
    {
     jf.setTitle("DISPLAY");
    }
    jf.validate();
    jf.repaint();
   }
  });
  cb1.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent ie)
   {
    if(ie.getStateChange() == ItemEvent.SELECTED)
    {
     jl.setText("SASTRA-CSE");
    }
    else
    {
     jl.setText("SASTRA");
    }
    jf.validate();
    jf.repaint();
   }
  });
  cb2.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent ie)
   {
    if(ie.getStateChange() == ItemEvent.SELECTED)
    {
     jl.setText("SASTRA-IT");
    }
    else
    {
     jl.setText("SASTRA");
    }
    p1.validate();
    p1.repaint();
   }
  });
  p1.setLayout(null);
  p1.setBounds(0,0,500,50);
  Timer t = new Timer(100,new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
    jl.setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    jl.setLocation(x+=1,y);
    p1.validate();
    p1.repaint();
   }
  });
  t.start();
  p1.setSize(500,500);
  jf.setSize(1920,1080);
  jf.setVisible(true);
  jf.validate();
  jf.repaint();
 }
 public static void main(String args[])
 {
  new TimerGUI();
 }
}
