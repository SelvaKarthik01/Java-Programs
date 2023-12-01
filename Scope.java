class Scope
{ static int m;
public static void main ( String args[] )
{
 int x;
 {
 Scope s=new Scope();
System.out.println("m="+m+"x="+x);
}
}
}
