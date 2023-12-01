import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class MenuDemo
{
 JFrame jf;
 JTextArea ta;
 JMenuBar jmb;
 JMenu mnuFile;
 JMenu mnuColor;
 JMenuItem mOpen;
 JCheckBoxMenuItem mFore;
 MenuDemo() 
 {
  jf = new JFrame("Notepad");
  jf.setLayout(null);
  ta  = new JTextArea();
  jf.setSize(1920,1080);
  jf.setVisible(true);
  mnuFile = new JMenu("File");
  mnuColor = new JMenu("Color");
  jmb = new JMenuBar();
  jmb.add(mnuFile);
  jmb.add(mnuColor);
  jf.setJMenuBar(jmb);
  mOpen = new JMenuItem("Open");
  mFore = new JCheckBoxMenuItem("Foreground");
  mnuFile.add(mOpen); 
  mnuColor.add(mFore);
  mOpen = new JMenuItem("Open",KeyEvent.VK_O);
  mOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
  mOpen.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
    JFileChooser fc = new JFileChooser();
    int option = fc.showOpenDialog(jf);
    if(option == JFileChooser.APPROVE_OPTION)
    {
     try{
     File f =fc.getSelectedFile();
     FileInputStream fis = new FileInputStream(f);
     byte data[] = new byte[(int)f.length()];
     fis.read(data);
     ta.setText(""+new String(data));
     }catch(Exception e){}
    } 
   }
  });
  mFore.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent ie)
   {
    if(mFore.getState())
    {
     ta.setForeground(Color.red);
    }
    else
    {
     ta.setForeground(Color.black);
    }
   }
  });
  ta.setBounds(0,0,jf.getWidth(),jf.getHeight());
  jf.add(ta);
 }
 public static void main(String args[])
 {
  new MenuDemo();
 }
}

