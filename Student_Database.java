class Student
{
 int Stud_id;
 double marks;
 void getInput(int Stud_id, double marks)
 {
  this.Stud_id = Stud_id;
  this.marks = marks;
 }
 public String toString()
 {
  if(marks > 91)
  {
   return "Student ID -->"+ Stud_id +" Scored a S Grade";
  }
  else if(marks > 85)
  {
   return"Student ID -->"+ Stud_id + " Scored a A+ Grade";
  }
  else if(marks > 80)
  {
   return "Student ID -->"+ Stud_id +" Scored a A Grade";
  }
  else if(marks > 70)
  {
   return "Student ID -->"+ Stud_id +" Scored a B Grade";
  }
  else if(marks > 60)
  {
   return "Student ID -->"+ Stud_id + " Scored a C Grade";
  }
  else if(marks > 50)
  {
   return "Student ID -->"+ Stud_id +" Scored a D Grade";
  }
  else
  {
   return "Student ID -->"+ Stud_id + " Failed in this Exam";
  }
 }
}
class Student_Database
{
 public static void main(String args[])
 {
  Student S = new Student();
  S.getInput(1001,94.3);
  System.out.println("Result of the Student : " + S);
 }
}
 