//Implement Runnable Interface for Creating a Thread Program 
// 1. To Implement Runnable Interface 
class NewThread1 implements Runnable  
{
 Thread t; // 2. Just Create a Thread Reference
 NewThread1(String name)
 {
  t = new Thread(this,name); //1st Parameter is the Reference that is Current Pointer
  t.start();
  
 }
 /*Whenever we use run command it is necessary ot use .sleep() the reason is because it will make the CPU in IDLE state and check for other running State so that we connect another thread together. If we dont use .sleep() it will act as if it is a single thread program */
 public void run() // Execution point in a Concurrent Manner 
 { 
  try
  {
   for(int i=0;i<5;i++)
   {
    System.out.println(t.getName()+"\t i= "+i+"\t"+t.getState());
    Thread.sleep(800);
   }
  }catch(InterruptedException e){}
 }
}
class ThreadDemo1
{
 public static void main(String[] args)
 {
  NewThread1 t1 = new NewThread1("First Thread");
  System.out.println(t1.t.getName()+" "+t1.t.getState());
  NewThread1 t2 = new NewThread1("Second Thread");
  System.out.println(t2.t.getName()+" "+t2.t.getState());
  NewThread1 t3 = new NewThread1("Third Thread");
  System.out.println(t3.t.getName()+" "+t3.t.getState());
 }
}