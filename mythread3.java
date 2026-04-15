import java.lang.*;
class smart implements Runnable
{
    public void run()
    {
        System.out.println("Inside Thread:" + Thread.currentThread().getName());
    }
}
class mythread3
{
    public static void main(String args[])
    {
        smart  sobj1=new smart();
        Thread t1 =new Thread(sobj1,"frist");

        smart sobj2=new smart();
        Thread t2 =new Thread(sobj2,"second");
        t1.start();
        t2.start();
    }
} 