import java.lang.*;
class smart extends Thread
{
    public void run()
    {
        System.out.println("Inside Thread:"+Thread.currentThread().getName());
        System.out.println("Thread priority is"+Thread.currentThread().getPriority());
    }
}
class mythread7
{
    public static void main(String[] args) 
    {
      System.out.println("main Thread prirotity is:"+Thread.currentThread().getPriority());    
      smart sobj1 = new smart();
      Thread t1=new Thread(sobj1,"frist");
      smart sobj2 = new smart();
      Thread t2= new Thread(sobj2,"second");
      t1.setPriority(2);
      t2.setPriority(10);
      t1.start();
      t2.start();
    }
}


