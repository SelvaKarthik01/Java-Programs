/* Create an abstract class Account with protected data members accnumber of int type, balance of
double, and constructors for initialization and display().*/
abstract class Account
{
 int account_no;
 double balance;
 
 public Account(int account_no,double balance)
 {
  this.account_no = account_no;
  this.balance = balance;
 }
 abstract void deposit(double money);
 abstract void withdraw(double money);
 abstract void calc_interest();
 public String toString()
 {
  return "Account Number : "+ account_no + "\nBalance : "+balance;
 }
}