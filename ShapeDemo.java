// Dynamic Method Displatch or Rumtime Polymorphism 
/*Base Class Reference is Compatible with Derived Class Objects*/
// Hierchial Inheritance 
import java.util.*;
abstract class Shape
{
 public Shape(double dim1,double dim2)
 {
  this.dim1 = dim1;
  this.dim2 = dim2;
 }
 double dim1,dim2;
 abstract double area();
}
class Rectangle extends Shape
{
 public Rectangle(double length,double breadth)
 {
  super(length,breadth);
 }
 double area()
 {
  System.out.println("Area of Rectangle : ");
  return dim1*dim2;
 }
}
class Triangle extends Shape
{
 public Triangle(double base,double height)
 {
  super(base,height);
 }
 double area()
 {
  System.out.println("Area of Triangle : ");
  return 0.5*dim1*dim2;
 }
}
class ShapeDemo
{
 public static void main(String args[])
 {
  Shape S[] = new Shape[5]; //<--- Reference
  System.out.println("Enter Your Choice : ");
  Scanner input = new Scanner(System.in);
  int ch = input.nextInt();
  if(ch == 1)
  {
   S = new Rectangle(10,20);//Refernece of a Derived Class Object
   System.out.println("" +S.area());
  }
  else if (ch == 2)
  {
   S= new Triangle(10,20);
   System.out.println(""+S.area());
  }
  /*System.out.println("Rectangle : ");
  Rectangle R = new Rectangle(10,20);
  System.out.println("" +R.area());
  System.out.println("Triangle ");
  Triangle T = new Triangle(10,20);
  System.out.println("" +T.area());*/
 }
}
  
 
