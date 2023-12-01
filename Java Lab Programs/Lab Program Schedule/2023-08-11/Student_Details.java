/*Create a student class with student no name and marks in three subjects define no argument constructor parameterizes constructor and copy constructor overriding toString function to display all data . Create a another class Create an array of student get the proper data and display . Define one member function to calculate result to compute the result based on result .
for loop for getting data and for each loop*/
import java.util.*;
class Student
{
 int Stud_ID;
 String Student_Name;
 double marks1,marks2,marks3;
 public Student()
 {
  marks1=marks2=marks3=0.0;
  Stud_ID = 0;
  Student_Name = "";
 }
 public Student(int Stud_ID,String Student_Name,double marks1,double marks2,double marks3)
 {
  this.Stud_ID = Stud_ID;
  this.Student_Name = Student_Name;
  this.marks1 = marks1;
  this.marks2 = marks2;
  this.marks3 = marks3;
 }
 public Student(Student Copy)
 {
  this.Stud_ID = Copy.Stud_ID;
  this.Student_Name = Copy.Student_Name;
  this.marks1 = Copy.marks1;
  this.marks2 = Copy.marks2;
  this.marks3 = Copy.marks3;
 }
 public int Calculate_Result(Student S)
 {
  double result;
  result = (S.marks1 + S.marks2 + S.marks3)/3;
  if(result >=50)
  {
   return 1;
  }
  else
  {
   return 0;
  }
 }
 public String toString()
 {
  return "Student ID : " + Stud_ID + "\nStudent Name : "+Student_Name+"\nMarks in 3 Subjects : ["+marks1+", "+marks2+", "+marks3+"]";
 }
}
class Student_Details
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the Total No. of Students to be Added in Database : ");
  int n = input.nextInt();
  Student S[] = new Student[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Student No. "+ i+1 + ":");
   System.out.println("\n");
   System.out.println("1. New Student");
   System.out.println("2. Copy Student Details");
   System.out.println("3. To Exit");
   System.out.println("Enter Your Choice : ");
   int choice = input.nextInt();
   if(choice == 1)
   {
    System.out.println("Do You Want to Enter Data (1/0) ");
    ch = input.nextInt();
    if(ch == 1)
    {
     System.out.println("Enter the Student ID : ");
     int Stud_ID = input.nextInt();
     System.out.println("Enter the Student Name : ");
     String Student_Name= input.next();
     System.out.println("Enter the Mark in First Subject : ");
     double marks1 = input.nextDouble();
     System.out.println("Enter the Mark in Second Subject : ");
     double marks2 = input.nextDouble();
     System.out.println("Enter the Mark in Third Subject : ");
     double marks3 = input.nextDouble();
     S[i] = new Student(Stud_ID, Student_Name,marks1,marks2,marks3);
    }
    else
    {
      S[i] = new Student();
    }
   }
   else if(choice == 2)
   {
    System.out.println("Enter the Index no. of the Student Data to be Copied : ");
    int copy = input.nextInt();
    //Student S[i] = S[copy];
   }
   else
   {
    break;
   }
  }
  int i=1;
  System.out.println("Student Database Details :\n ");
  for(Student x : S)
  {
   System.out.println("Student No. "+ i++ +"\n"+x);
   int result = x.Calculate_Result(x);
   if(result == 1)
   {
    System.out.println("Result : PASS ");
   }
   else if(result == 0)
   {
    System.out.println("Result : FAIL ");
   }
   System.out.println("\n");
  }
 }
}


   
    
   

  
 
 
  
   
  