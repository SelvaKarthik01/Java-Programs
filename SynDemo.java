/* Thread Synchronization

When two Threads are accessing a comman resource Inconsistent Result may occur as it takes the copy of the data and perform the action without getting the desired output.

Synchronization helps in accessing the common resource alone Sequentialy preventing Inconsistent Result and allows other instructiosn to be performed Paralelly.


Keyword - synchronized 
To Create method and block
synchornized block should be present in run() method.
synchronized(parameter) -> parameter wherever is present in the code block that statments
alone in a synchronized manner.


Q) Create a Class to store integer array to 10 elements Initialize a Constructor to hold 10 elements . One thread is responsilbe to add + 10 to all elements and another thread -20 to each and every element in the another.

*/
class Account
{
 int accno;
 double balance;
 Account(int accno,double balance)
 {
  this.accno = accno;
  this.balance = balance;
 }
 synchronized void deposit(double amt)
 {
  double t = balance;
  t = t+ amt;
  balance =t;
  System.out.println(this);
 }
 synchronized void withdraw(double amt)
 {
  double t = balance;
  t = t-amt;
  balance =t;
  System.out.println(this);
 }
 public String toString()
 {
  return "Account No :"+accno+"\n Balance : "+balance;
 }
}
class AccountDemo implements Runnable
{
 Account a;
 Thread t;
 int choice;
 AccountDemo(Account a,int choice)
 {
  this.a=a;
  this.choice = choice;
  t=new Thread(this);
 }
 public void run()
 {
  if(choice == 1)
  {
   a.deposit(1000);
  }
  else
  {
   a.withdraw(500);
  }
 }
}
class SynDemo
{
 public static void main(String args[])
 {
  Account cr =new Account(1234,5000);
  AccountDemo t1 = new AccountDemo(cr,1);
  AccountDemo t2 = new AccountDemo(cr,2);
  t1.t.start();
  t2.t.start();
 }
}
  
  
  




























 