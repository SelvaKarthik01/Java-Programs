/*BufferReader - Buffer Character Input Stream
BufferWriter - Buffer Character Output Stream
FileReader
FileWriter

Use Reader and Writer for txt and Document File
Use InputStream and OutputStream for dat and exe files
*/
import java.io.*;
class Student implements Serializable
{
 int roll;
 String name;
 Student(int roll,String name)
 {
  this.roll = roll;
  this.name = name;
 }
 public String toString()
 {
  return "Roll No. : "+roll+"\nName : "+name;
 }
}
class IO
{ 
 public static void main(String args[])throws Exception 
 {
  FileOutputStream fout = new FileOutputStream("student.dat");
  ObjectOutputStream out = new ObjectOutputStream(fout);
  Student s1 = new Student(1001,"Dhoni");
  out.writeObject(s1);
  Student s2 = new Student(1002,"Blast Mohan");
  out.writeObject(s2);
  out.close();
  fout.close();
  FileInputStream  fin = new FileInputStream("student.dat");
  ObjectInputStream in = new ObjectInputStream(fin);
  Student s;
  try
  {
   while(true)
   {
    s = (Student)in.readObject();
    System.out.println(s); 
   }
  }catch(Exception e){System.out.println("End of File ....");}
 }
}
 