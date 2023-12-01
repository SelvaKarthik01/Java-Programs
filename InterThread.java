//InterThreading Communication

//wait(),notify(),notifyall() -final
class Q 
{
 int n;
 boolean f = false;
 synchronized int get()
 {
  try
  {
  while(f)
  {
   wait();
  }
  System.out.println("got.."+n);
  f = true;
  notify();
  
 }catch(Exception e){}
  return n;
 }
 synchronized void put(int n)
 {
  try
  {
  while(!f)
  {
   wait();
  }
  this.n=n;
  System.out.println("put.."+n);
  f = false;
  notify();
 }catch(Exception e){}
 }
}
class Producer implements Runnable
{
 Q q;
 Thread t;
 Producer(Q q)
 {
  this.q = q;
  t = new Thread(this,"Producer");
 }
 public void run()
 {
  int i = 0;
  while(true)
  {
   q.put(++i);
  }
 }
}
class Consumer implements Runnable
{
 Q q;
 Thread t;
 Consumer(Q q)
 {
  this.q = q;
  t = new Thread(this,"Producer");
 }
 public void run()
 {
  while(true)
  {
   q.get();
  }
 }
}
class InterThread
{
 public static void main(String args[])
 {
  Q q = new Q();
  Producer P = new Producer(q);
  Consumer C = new Consumer(q);
  P.t.start();
  C.t.start();
 }
}


  
  

