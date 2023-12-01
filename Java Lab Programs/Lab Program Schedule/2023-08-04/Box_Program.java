class Box
{
 double length,width,height;
 void getInput(double length, double width, double height)
 {
  this.length = length;
  this.width = width;
  this.height = height;
 }
 public String toString()
 {
  return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
 }
}
class Box_Program
{
 public static void main(String args[])
 {
  Box B = new Box();
  B.getInput(5.1,6.3,6.6);
  System.out.println("Box Details : \n" + B);
 }
}
 
 