import java.util.*;
class Input
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Float Input");
  System.out.println("Enter the Number: ");
  float a = input.nextFloat();
  System.out.println("Integer Input");
  System.out.println("The Entered Number is : "+a);
  System.out.println("Enter the Number: ");
  int b = input.nextInt();
  System.out.println("The Entered Number is : "+b);
  System.out.println("Double Input");
  System.out.println("Enter the Number: ");
  double c = input.nextDouble();
  System.out.println("The Entered Number is : "+c);
  System.out.println("String Input");
  System.out.println("Enter the Text: ");
  String str = input.next();
  System.out.println("The Entered Number is : "+str); 

 }
}