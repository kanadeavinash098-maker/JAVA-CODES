import java.lang.*;
class Demo extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Name of i:" +i);
            try
            {
                Thread.sleep(111000);
            }
            catch(Exception obj) 
            {
               
            }
        }
    }
}
class mythread4 {
    public static void main(String args[])throws Exception
    {
     Demo obj1 =new Demo();
     Thread t1=new Thread(obj1,"frist");
     Demo obj2 =new Demo();
     Thread  t2 = new Thread(obj2,"second");
     t1.start();
     t1.join();
     t2.start();
    }
    
}
