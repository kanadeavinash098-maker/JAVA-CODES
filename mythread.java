import java.lang.*;
class smart extends Thread
{
    public void run()  //state
    {
        System.out.println("Inside thread:"+ Thread.currentThread().getName());
    }

}
 class mythread
 {
    public static void main(String[] args) {
        smart sobj1= new smart();
        Thread t1= new Thread(sobj1,"First");
        Thread t2= new Thread(sobj1,"second");
        Thread t3= new Thread(sobj1,"third");
        Thread t4= new Thread(sobj1,"Fourth");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
 }
