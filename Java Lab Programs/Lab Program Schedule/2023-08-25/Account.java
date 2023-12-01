/* Create an abstract class Account with protected data members accnumber of int type, balance of
double, and constructors for initialization and display().*/
package pkaccount;
public class Account
{
 public int account_no;
 double balance;
 public Account(int account_no,double balance)
 {
  this.account_no = account_no;
  this.balance = balance;
 }
 public String toString()
 {
  return "Account Details : \n"+"Account Number : "+ account_no + "\nBalance : "+balance;
 }
}