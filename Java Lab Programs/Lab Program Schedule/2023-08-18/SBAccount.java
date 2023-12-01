/*Derive a class called SBAccount – Methods constructor, deposit(double), withdraw(double),
calc_interest()*/
class SBAccount extends Account
{
 public SBAccount(int accnumber,double balance)
 {
  super(accnumber,balance);
 }
 void deposit(double money)
 {
  balance = balance + money;
  System.out.println("Money Deposited Successfully !!");
 }
 void withdraw(double money)
 {
  balance = balance - money;
  System.out.println("Money Withdrawn Successfully !!");
 }
 void calc_interest()
 {
  double interest;
  interest = balance * 0.07;
  System.out.println("Total Interest : "+interest);
 }
 public String toString()
 {
  String s = super.toString();
  return s  ;
 }
}