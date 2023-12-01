package pkaccount.customer;
import pkaccount.sa.SBAccount;
public class Customer 
{
 public int cust_id;
 public String name,address;
 public SBAccount S;
 public Customer(int cust_id,String name,String address,SBAccount S)
 {
  this.cust_id = cust_id;
  this.name = name;
  this.address = address;
  this.S = S;
 }
 public String toString()
 {
  return "Customer ID : "+cust_id+"\nCustomer Name : "+name+"\nAddress : "+address +"\n\n"+ S;
 }
}