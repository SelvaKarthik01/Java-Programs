/* Multithreading - Language Package 
  i) java.lang.thread 
  ii) java.lang.runnable
Two ways to create multithreading 
i) Extending our own class 
ii) using thread class itself (if it is naturally threadable)


new State and Runnable State 
new State - Creating our own Mutithreading program 
Runnable State - the Thread is avaiable to the CPU
We can invoke the Runnable State from new State by using start()
start() method should be called by the developer 
Running State() the State where is thread is been run by the CPU id called Running State()
This can only be called by the OS and NOT BY THE DEVELOPER.
Blocked State() The Thread is been made to sleep in the CPU for a period of time is called Blocked State.
This can be invioked using sleep(),suspend(),wait() to make thread in IDLE state.
sleep() - Timed wait - to make in IDLE in CPU.
suspend()- This is not a Timed Wait . This is basically used to make the Thread IDLE during Synchronization and Automatically resumes after the event.
Wait() - This is not Timed wait. This is very simialr to that of suspend but here instead of Synchronization, in Messaging scenarios it is used.
Dead State() can be invoked using the stop().Like once in Running State it has been completed the thread can go to the Dead State using the Stop().
If we want the Thread to go from Blaocked State to Runnable State resume() or notify() can be used. 
If we use suspend --> blocked state() ---> resume() can be used.
If we use wait() ---> blocked state() ---> notify() can be used.


One such important interaction between Threads two or n numbers of threads in a Common Platform is called Synchronization.

Basically Communication between two or more threads is called Messaging.
Synchroziation and Communication souldnt be confused there are completely different with each other.


      new
       | ---> Start()
       |
       |
|---->Runnable ----> stop() ---> Dead State()
|      |
|      |---> run() only be the OS
|      |
|    Running 
|      | ---) sleep(), wait(),suspend()
|      |
|      |
| -- Blocked ----> In this state for a very longtime ---> Dead State()
|
\/
notify(), resume()

Multithreading works on the principle of Parent child thread Relationship where Parent Thread acts as the Main Thread. 

Some main Function inside Thread class : 

java.lang.Thread
currentThread() //Static method
sleep() // static method --> parameter is an integer in milliseconds
getname() --> Returns the Current Running Thread Name in CPU
setname(String) //nonstatic
getPriority(),setPriority(int)
*/
class ThreadDemo extends Thread
{
 public void run()
 {
  int i=1;
  while(true)
  {
   System.out.println(i+"Hello");
   i++;
  }
 }
 public static void main(String args[])
 {
  ThreadDemo t = new ThreadDemo();
  t.start();
  int i=0;
  while(true)
  {
   System.out.println(i+"World");
   i++;
  }
 }
}


