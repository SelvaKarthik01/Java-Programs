class NewThread implements Runnable
{
 String name;
 Thread t;
 NewThread(String name)
 {
  this.name = name;
  t = new Thread(this,name);
 }
 public void run()
 {
  try
  {
   for(int i=10;i>0;i--)
   {
    System.out.println(name+": "+i);
    Thread.sleep(500);
    }
  }catch(Exception e){}
 } 
}
class ThreadDemo
{
 public static void main(String args[]) 
 {
  NewThread t1 = new NewThread("One");
  NewThread t2 = new NewThread("Two");
  NewThread t3 = new NewThread("Three");
  t1.t.start();
  t2.t.start();
  t3.t.start();
  try
  {
   Thread.sleep(1000);
  }catch(Exception e){}
 }
}
  