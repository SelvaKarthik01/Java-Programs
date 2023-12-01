/*Create a class called Customer – Data Members cust_id of int type, name, and address of string
type, and objects of SBAccount*/
import java.util.*;
class Customer 
{
 int cust_id;
 String name,address;
 SBAccount S;
 public Customer(int cust_id,String name,String address,SBAccount S)
 {
  this.cust_id = cust_id;
  this.name = name;
  this.address = address;
  this.S = S;
 }
 public String toString()
 {
  return "Customer ID : "+cust_id+"\nCustomer Name : "+name+"\n Address : "+address +"\n"+ S;
 }
}
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
   int acc_count = 0;
   System.out.println("Customer No."+(i+1)+"\n");
   SBAccount S[] = new SBAccount[5];
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
   S[acc_count ++] = new SBAccount(accnumber,balance);
   C[i] = new Customer(cust_id,name,address,S[acc_count]);
   if(acc_count <=5)
   {
    int a = -1;
    while (a!=0)
    {
     System.out.println("Do you want to Create Another SBAccount (1/0) : ");
     a = input.nextInt();
     if(a == 1)
     {
      System.out.println("Enter the Account No. : ");
      int accnumber = input.nextInt();
      System.out.println("Enter the Balance : ");
      double balance = input.nextDouble();
      S[acc_count++] = new SBAccount(accnumber,balance);
     }
    }
   }
  }
  System.out.println("Customer Objects are Successfully Added !!");
  System.out.println("Enter the Cutsomer ID to perform Transaction : ");
  int id = input.nextInt();
  int index = -1;
  for(int i=0;i<n;i++)
  {
   if(C[i].cust_id == id)
   {
    index=i;
    break;
   }
  }
  int choice = 0;
  int acc_index;
  System.out.println("Enter Your Account No. : ");
  int account_number = input.nextInt();
  for(int i=0;i<5;i++)
  {
   if(C[index].S[i].accnumber == account_number)
   {
    acc_index = i;
    break;
   }
  }
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
    C[index].S[acc_index].deposit(money);
   }
   else if(choice == 3)
   {
    System.out.println("Enter the Amount to be Withdrawn : ");
    double money = input.nextDouble();
    C[index].S[acc_index].withdraw(money);
   }
   else if (choice == 4)
   {
    C[index].S[acc_index].calc_interest();
   }
   else if(choice == 5)
   {
    System.out.println("Thank You !!");
    break;
   }
  }
 }
}


  
  
   
   
 
