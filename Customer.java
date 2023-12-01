import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

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
