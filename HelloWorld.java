class Addition
{
 int a,b;
 void getInput(int a, int b)
 {
  this.a = a;
  this.b = b;
 }
 void Display()
 {
  int c;
  c = a + b;
  System.out.println("Addition of Two numbers : " + c);
 }
}
class AdditionFile
{
 public static void main(String args[])
 {
  Addition A = new Addition();
  A.getInput(5,3);
  A.Display();
 }
}