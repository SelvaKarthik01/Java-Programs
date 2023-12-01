class Employee
{
 int EmpID, Ex;
 double salary;
 void getInput( int EmpID, double salary, int Ex)
 {
  this.EmpID = EmpID;
  this.salary = salary;
  this.Ex = Ex;
 }
 public String toString()
 {
  return "Employee ID = " + EmpID + "\nYears of Experience = " + Ex +  "\nSalary = " + salary;
 }
}
class Employee_Database
{
 public static void main(String args[])
 {
  Employee E = new Employee();
  E.getInput(1001,3500.35,5);
  System.out.println("Employee Details : \n" + E);
 }
}

 