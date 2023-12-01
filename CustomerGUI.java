import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Customer 
{
 
 String Cust_name;
 int Cust_Id;
 String City;
 String State;
 int pincode;
 Customer(String Cust_name,int Cust_Id,String State,String City,int pincode)
 {
  this.Cust_name = Cust_name;
  this.Cust_Id = Cust_Id;
  this.State = State;
  this.City = City;
  this.pincode = pincode;
 }
 public String toString()
 {
   return "Customer ID : "+Cust_Id+"\n Customer Name : "+Cust_name + "\n State : "+State+"\n City : "+City+"\n Pincode : "+pincode;
 }
}

class CustomerGUI
{
 ArrayList<Customer> ar;
 JPanel jp1,jp2,jp3;
 JFrame jf;
 JTextField txtname,txtno,txtcity,txtstate,txtpincode;
 JLabel lblname,lblno,lblstate,lblcity,lblpincode;
 JButton btnadd;
 CustomerGUI()
 {
  ar = new ArrayList<Customer>();
  jf = new JFrame("Customer Management Software");
  jf.setLayout(new GridLayout(1,3));
  jp1 = new JPanel();
  jf.add(jp1);
  jp1.setLayout(new GridLayout(7,2,0,20));
  lblname =  new JLabel("Customer Name : ");
  jp1.add(lblname);
  txtname = new JTextField(20);
  jp1.add(txtname);
  lblno =  new JLabel("Customer ID : ");
  jp1.add(lblno);
  txtno = new JTextField(20);
  jp1.add(txtno);
  lblstate =  new JLabel("State : ");
  jp1.add(lblstate);
  txtstate = new JTextField(20);
  jp1.add(txtstate);
  lblcity =  new JLabel("City : ");
  jp1.add(lblcity);
  txtcity = new JTextField(20);
  jp1.add(txtcity);
  lblpincode =  new JLabel("Pincode : ");
  jp1.add(lblpincode);
  txtpincode = new JTextField(20);
  jp1.add(txtpincode);
  btnadd = new JButton("Add Customer");
  jp1.add(btnadd);
  btnadd.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
    ar.add(new Customer(txtname.getText(),Integer.parseInt(txtno.getText()),txtstate.getText(),txtcity.getText(),Integer.parseInt(txtpincode.getText())));
    jp1.repaint();
    jf.getContentPane().repaint();
    System.out.println(ar);
    //JOptionPane.showMessageDialog(jf,"WARNING","Error",JOptionPane.WARNING_MESSAGE);
   }
  }
  );
  jp2 = new JPanel();
  jp2.setBackground(Color.red);
  jf.add(jp2);
  jp3 = new JPanel();
  jp3.setBackground(Color.yellow);
  jf.add(jp3);
  jf.getContentPane().repaint();
  jf.setSize(500,500);
  jf.setVisible(true);
 } 
 public static void main(String args[])
 { 
  new CustomerGUI();
 }
}
