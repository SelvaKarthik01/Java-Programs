import java.util.*;
class BadOperandException extends Exception
{
 int op1,op2;
 BadOperandException(String msg,String a,String b)
 {
  super(msg);
  op1=a;
  op2= b;
 }
 public String toString()
 {
  return "BadOperandException:"+this.getMessage()+"Operand not type int";
 }
}
class BadOperatorException extends Exception
{
 String opr;
 BadOperandException(String msg,String o)
 {
  super(msg);
  opr=o;
 }
 public String toString()
 {
  return "BadOperatorException:"+this.getMessage()+opr+"Operator is Invalid";
 }
}
class OperationFailedException extends Exception
{ 
 String des;
 OperandFailedException(String msg,String s)
 {
  super(msg);
  des= s;
 }
 public String toString()
 {
  return "OperationFailedException"+this.getMessage()+"Expression Invalid !";
 }
}
class Expression
{
 String op1,op2;
 String opr;
 String des = op1 + opr + op2;
 public Expression(String op1,String op2,String opr)
 {
  try
  {
   for(int i=0;i<op1.length();i++)
   {
    if(op1[i] >= '0' && op1[i] <= '9')
    {
     continue;
    }
    else
    {
     OperationFailedException e =OperationFailedException("OperationFailedException",des);
     e.initcause(new BadOperandException("BadOperandException",des));
     throw e;
    }
   }
   for(int i=0;i<op2.length();i++)
   {
    if(op2[i] >= '0' && op2[i] <= '9')
    {
     continue;
    }
    else
    {
     OperationFailedException e =OperationFailedException("OperationFailedException",des);
     e.initcause(new BadOperandException("BadOperandException",des));
     throw e;
    }
   }
  }catch(OperationFailedException e)
  {
   System.out.println("Caught..."+e+"Caused By : "+e.getcause());
  }
  try
  {
   String OperatorsAllowed[] = new String[5];
   OperatorsAllowed[0]= ""+"";
   OperatorsAllowed[1]=""-"";
   OperatorsAllowed[2]=""*"";
   OperatorsAllowed[3]=""/"";
   OperatorsAllowed[4]=""%"";
   for(int i=0;OperatorsAllowed.length();i++)
   {
    if(opr.equals(OperatorsAllowed[i]))
    {
     continue;
    }
    else
    {
     OperationFailedException e =OperationFailedException("OperationFailedException",des);
     e.initcause(new BadOperatorException("BadOperatorException",des));
     throw e;
    }
   }
  }catch(OperationFailedException e)
  {
   System.out.println("Caught..."+e+"Caused By : "+e.getcause());
  }
  try
  {
   op1 = Integer.parseInt(op1);
   op2 = Integer.parseInt(op2);
  }catch(NumberFormatException e)
  {
   System.out.println("Invalid String!!");
  }
  double result;
  if(opr.equals("+"))
  {
   result = op1 + op2;
  }
  else if(opr.equals("-"))
  {
   result = op1 - op2;
  }
  else if(opr.equals("*"))
  {
   result = op1 * op2;
  }
  else if(opr.equals("/"))
  {
   result = op1 / op2;
  }
  else if(opr.equals("%"))
  {
   result = op1 % op2;
  }
 }
 public String toString()
 {
  return "The Result for the Expression - "+des+" : "+result;
 }
}
class ExceptionHandling
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the First Operand: ");
  int op1 = input.nextInt();
  System.out.println("Enter the Second Operand: ");
  int op2 = input.nextInt();
  System.out.println("Enter the Operator : ");
  String opr = input.next();
  Expression E = new Expression(op1,op2,opr);
  System.out.println(""+E);
 }
}
    
  
    
 