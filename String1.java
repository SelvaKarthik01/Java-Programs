class String1
{
 public static void main(String args[])
 {
  String s1 = "SASTRA";
  byte bdata[] = new byte[10];
  bdata = s1.getBytes();
  
  System.out.println(new String(bdata));
 }
}
