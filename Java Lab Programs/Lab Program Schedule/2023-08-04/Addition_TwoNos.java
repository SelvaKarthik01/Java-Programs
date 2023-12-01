class Add
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
  System.out.println("Addition of "+a+" + " + b + " = "+ c);
 }
}
class Addition_TwoNos
{
 public static void main(String args[])
 {
  Add A = new Add();
  A.getInput(5,3);
  A.Display();
 }
}
 
 