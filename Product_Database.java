class Product
{
 int prod_ID,qty;
 double price;
 void getInput(int prod_ID,int qty, double price)
 {
  this.prod_ID = prod_ID;
  this.qty = qty;
  this.price =price;
 }
 void Display()
 {
  System.out.println(prod_ID.toString() + " <---- Product ID\n " + qty +  " <----Quantity\n " + price + " <---- Price ");
 }
}
class Product_Database
{
 public static void main(String args[])
 {
  Product P =new Product();
  P.getInput(1001,5,140.75);
  System.out.println("Product Details : \n");
  P.Display();
 }
}