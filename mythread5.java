import java.lang.*;
import java.util.*;
class smart
{
    public int arr[];
    public smart(int size)
    {
        arr =new int[size];
    }
    public void accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number");
        for(int i=0; i<this.arr.length; i++)
        {
            this.arr[i] =sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Data from array is:");
        for(int i=0; i<this.arr.length; i++)
        {
            System.out.println(this.arr[i]);
        }
    }
    synchronized public void DisplayEven()
    {
        for(int i=0; i<this.arr.length; i++)
        {
            if(this.arr[i]%2==0)
            {
                System.out.println(this.arr[i]);
            }

        }
    }
}
class Demo extends Thread
{
    smart sref;
    public Demo(smart obj)
    {
        this.sref = obj;
    }
    public void run()
    {
        this.sref.DisplayEven();
    }
}
class mythread5 
{
    public static void main(String args[])throws Exception
    {
      smart sobj1= new smart(4);
      smart sobj2 =new smart(4);
      sobj1.accept();
      sobj1.Display();
      sobj2.accept();
      sobj2.Display();
      Demo dobj1 = new Demo(sobj1);
      Demo dobj2 =new Demo(sobj2);
      Thread t1 = new Thread(dobj1);
      Thread t2 = new Thread(dobj2);
      t1.start();
      t2.start();
      t1.join();
      t2.join();
      System.out.println("End of the thread...");
    }
}
