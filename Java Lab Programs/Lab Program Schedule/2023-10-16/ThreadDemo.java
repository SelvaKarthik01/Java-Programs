class Queue 
{
 int q[];
 int front,rear;
 Queue()
 {
  int q[] = new int[100];
  front = -1;
  rear = -1;
 }
 boolean isEmpty()
 {
  if(rear == -1 && front == -1)
  {
   return true;
  }
  else  
  {
   return false;
  }
 }
 boolean isFull()
 {
  if(rear == 100)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 void enqueue(int d)
 {
  if(isFull() != true)
  {
   if(isEmpty() == true)
   {
    front+=1;
    q[front] = d;
    rear = 0;
   }
   else 
   {
    rear++;
    q[rear] = d;
   }
  }
  else
  {
   System.out.println("The Queue is Full !!");
  }
 }
 int dequeue()
 {
  int dataout = -1;
  if(isEmpty() == false)
  {
   dataout = q[front];
   front++;
  }
  if(front == rear)
  {
   dataout = q[front];
   front = -1;
   rear = -1;
  }
  else
  {
   System.out.println("The Queue is Empty !!");
  }
  return dataout;
 }
 synchronized void producer()
 {
  new Thread()
  {
   public void run()
   {
    try
    {
     for(int i=0;i<100;i++)
     {
      System.out.println("Enqueue Operation ");
      enqueue(i);
      System.out.println("Data Enqueued :  "+i);
      Thread.sleep(1000);
     }
    }catch(Exception e){System.out.println("Caught..."+e);} 
   }
  }.start();
 }
 synchronized void consumer()
 {
  new Thread()
  {
   public void run()
   {
    try
    {
     for(int i=0;i<100;i++)
     {
      System.out.println("Dequeue Operation");
      int dataout = dequeue();
      System.out.println("The Popped Data : "+dataout);
      Thread.sleep(1000);
     }
    }catch(Exception e){System.out.println("Caught..."+e);}
   }
  }.start();
 }
}
class ThreadDemo
{
 public static void main(String args[])
 {
  Queue Q = new Queue();
  Q.producer();
  Q.consumer();									
 }
}
   
     
 
      
       
 
 
 
 
 