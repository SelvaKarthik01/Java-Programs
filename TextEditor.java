/*
KeyEvent 
KeyListener

ScrollBar(int,int,int,int,int);
AdjustmentEvent

int getValue();
AdjustmentListener

*/

import java.awt.*;
import java.awt.event.*;
class TextEditor extends Frame 
{
 String msg = "SASTRA";
 List lstStyle;
 Scrollbar sc; // 1. Create COntrol
 TextEditor()
 {
  setLayout(null);
  setVisible(true);
  setSize(500,500);
  setFont(new Font("Arial",Font.BOLD,20));
  sc = new Scrollbar(Scrollbar.VERTICAL,0,5,0,50); // 2. Control Unit
  add(sc); //3. Add control
  lstStyle = new List();
  lstStyle.add("BOLD");
  lstStyle.add("PLAIN");
  lstStyle.add("ITALIC");
  add(lstStyle);
  sc.setBounds(50,50,50,300);
  lstStyle.setBounds(150,50,200,50);
  lstStyle.addItemListener(new ItemListener()
  {
   public void ItemValueChanged(ItemEvent ae)
   {
    if(lstStyle.getSelectedItem().equals("BOLD"))
    {
     setFont(new Font("Arial",Font.BOLD,20));
    }
    else if(lstStyle.getSelectedItem().equals("ITALIC"))
    {
     setFont(new Font("Arial",Font.ITALIC,20));
    }
    else
    {
     setFont(new Font("Arial",Font.PLAIN,20));
    }
    repaint();
   }
  });
  sc.addAdjustmentListener(new AdjustmentListener()
  {
   public void adjustmentValueChanged(AdjustmentEvent ae)
   {
    setFont(new Font("Arial",Font.BOLD,ae.getValue()));
    repaint();
   }
  });
  addKeyListener(new KeyAdapter(){
   public void keyTyped(KeyEvent ke)
   {
    msg += ke.getKeyChar();
    repaint();
   }
  });
   
 }
 public void paint(Graphics g)
 {
  g.drawString(msg,150,150);
 }
 public static void main(String args[])
 {
  new TextEditor();
 }
};
