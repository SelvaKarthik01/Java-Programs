/* Create an Class named Person with Name and Nationality . Create an Extended class Student with roll no , Degree . Create an Object for Student by involving Defualt,no argument and Parameterized COnstructors and Display name,nationality,Roll no na degree by overriding the toSTring functions */
import java.util.*;
class Person
{
 String Name,Nationality;
 public Person()
 {
  Name=Nationality="Null";
 }
 public Person(String Name,String Nationality)
 {
  this.Name = Name;
  this.Nationality = Nationality;
 }
 public String toString()
 {
  return "Name : "+Name+"\nNationality : "+Nationality;
 }
}
class Student extends Person
{
 int Roll_No;
 String Degree;
 public Student()
 {
  super();
  Roll_No=-1;
  Degree = "-";
 }
 public Student(String Name,String Nationality,int Roll_No,String Degree)
 {
  super(Name,Nationality);
  this.Roll_No = Roll_No;
  this.Degree = Degree;
 }
 public String toString()
 {
  String S = super.toString();
  return S + "\nRoll No. : "+Roll_No+"\nDegree : "+Degree;
 }
}
class Student_Data
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  Student S1 = new Student();
  System.out.println("No Argument Constructor : \n" + S1);
  System.out.println("Enter the Name of the Student : ");
  String Name = input.next();
  System.out.println("Enter the Nationality of the Student : ");
  String Nationality = input.next();
  System.out.println("Enter the Roll No of the Student : ");
  int Roll_No = input.nextInt();
  System.out.println("Enter the Degree of the Student : ");
  String Degree = input.next();
  Student S2 = new Student(Name,Nationality,Roll_No,Degree);
  System.out.println("Parametrized Constructor : \n"+ S2);
 }
}

  
 
 