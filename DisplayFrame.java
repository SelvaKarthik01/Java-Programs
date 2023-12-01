/*GUI - Graphical User Interface - Main Purpose of Java 
Event Driven Programming - User can interact through Events (GUI)
Normal Porgramming - COnsole based Approach
Delegation event Model (Objects)


Event Source - Raises an or creating an Event (Builin Sources like Button,Menu,Label,Timer etc Visible)
- Can generate the Event with or without the User interaction

Event 

Listener(interface)
- It is mainly responsible for handling the event.
- A method must be Overridden --- actionPerformed()
All EventSource,Event and Listener must be Interconnected for a proper GUI Program.

Ex:
   Button - EventSource
   Action - When Button Pressed -> Action Event - Perform a Specific Action
   Action Listener -> This Button Event is been Handled by The ActionListener.
   
   Mouse - EventSource
   MouseMotionEvent,MouseEvent - Event
   {
    MouseListener - mousePressed(),mouseReleased(),mouseClicked()
    MouseMotionListener - mouseMoved(),mouseDragged()
   }

Register the Listener to the Event :
 
addTypeListener()
removeTypeListener()

Delegation Event Model:
  Event Source must notify to the Listener and work aong with the Event.

||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
AWT = Abstract Windowing ToolKit
Swing 

Step 1 : Prepare a Design for the GUI (Where to place buttons, What Action should be triggered etc)
Step 2 : Component - Button,TextField etc
Container - Conatins all Component in one zone -> Frame, Window, Applet, Panel
Inheriting Properties: Window ---> Frame and Panel ---> Applet
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DisplayFrame extends Frame implements ActionListener
{
 Button btnClick;
 Label lblClick;
 DisplayFrame()
 {
  setVisible(true);
  setSize(500,500);
  setTitle("FirstFrame");
  setLayout(null);
  setBackground(Color.black);
  setForeground(Color.red);
  setFont(new Font("Arial",Font.BOLD,14));
  btnClick=new Button("Click");
  add(btnClick);
  btnClick.setBounds(50,50,100,30) ;
  //btnCLick.setBounds(Left(ycordinate),Right(xcordinate),Width,Height)
  lblClick = new Label(null);
  add(lblClick);
  lblClick.setBounds(100,150,200,200);
  btnClick.addActionListener(this);
  /* Using Anonymous Class 
  btnClick.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
    lblClick.setText("Welcome to GUI Programming");
   }
  });
 */
 }
 public void actionPerformed(ActionEvent ae)
 {
  lblClick.setText("Welcome to GUI Programming");
 }
 public static void main(String args[])
 {
  new DisplayFrame();
 }
}
  
   
 




  



