class Box
{
 double length,width,height;
 void setBox(double length,double width,double height)
 {
  this.length = length;
  this.width = width;
  this.height = height;
 }
 void getBox()
 {
  System.out.println("Length = "+length+"Width = "+width+"Height = "+height);
 }
}
class BoxDemo
{
 public static void main(String args[])
 {
  Box mybox = new Box();
  mybox.setBox(10.0,56.7,13.5);
  mybox.getBox();
 }
}