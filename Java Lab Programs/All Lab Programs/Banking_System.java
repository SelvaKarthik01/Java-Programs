/*Create a class called Customer – Data Members cust_id of int type, name, and address of string
type, and objects of SBAccount*/
import java.util.*;
import pkaccount.sa.SBAccount;
import pkaccount.customer.Customer;
class Banking_System
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the Total No. of Customers to be Added : ");
  int n= input.nextInt();
  Customer C[] = new Customer[n];
  for(int i=0;i<n;i++) 
  {
   System.out.println("Customer No."+(i+1)+"\n");
   System.out.println("Enter the Customer ID : ");
   int cust_id = input.nextInt();
   System.out.println("Enter the Name of the Customer :  ");
   String name = input.next();
   System.out.println("Enter the Address : ");
   String address = input.next();
   System.out.println("Enter the Account No. : ");
   int accnumber = input.nextInt();
   System.out.println("Enter the Balance : ");
   double balance = input.nextDouble();
   SBAccount S = new SBAccount(accnumber,balance);
   C[i] = new Customer(cust_id,name,address,S);
  }
  System.out.println("Customer Objects are Successfully Added !!");
  System.out.println("Enter the Cutsomer ID to perform Transaction : ");
  int id = input.nextInt();
  int index=0,flag=0;
  for(int i=0;i<n;i++)
  {
   if(C[i].cust_id == id)
   {
    index = i;
    flag = 1;
    break;
   }
  }
  if(flag == 0)
  {
   System.out.println("Customer ID not found !! Make Sure the ID is Correct and Try Again ");
  }
  else 
  {
  int choice = 0;
  while(choice != 5)
  {
   System.out.println("1.Display Account Details : ");
   System.out.println("2.Deposit Amount : ");
   System.out.println("3.Withdraw Amount : ");
   System.out.println("4.Calculate Interest : ");
   System.out.println("5. To Exit ");
   System.out.println("Enter Your Choice :  ");
   choice = input.nextInt();
   if (choice == 1)
   {
    System.out.println("Account Details : \n" + C[index]);
   }
   else if(choice == 2)
   {
    System.out.println("Enter the Amount to be Deposited : ");
    double money = input.nextDouble();
    C[index].S.deposit(money);
   }
   else if(choice == 3)
   {
    System.out.println("Enter the Amount to be Withdrawn : ");
    double money = input.nextDouble();
    C[index].S.withdraw(money);
   }
   else if (choice == 4)
   {
    C[index].S.calc_interest();
   }
   else if(choice == 5)
   {
    
    System.out.println("Thank You !!");
    break;
   }
  }
 }
 }
}
  
  
   
   
 
