import java.lang.*;
 abstract class Demo
{
    public int i,j;  // characterstics
    public Demo()
    {
        System.out.println("Demo constructar");
    }
    public void fun()
    {
        System.out.println("Demo fun");
    }
}

class Hello extends Demo{
    public int x,y;
    public Hello()
    {
        System.out.println("hello constructor");
    }
    public void sun()
    {
        System.out.println("Hello sun");
    }
    public void gun()
    {
       System.out.println("Hello gun");
    }
}

class AbstractDemo1
{
     public static void main(String args[])
     {
        /*Demo dobj =new  Demo();*/
        Hello Hobj = new Hello();
         Hobj.fun();
         Hobj.gun();
         Hobj.sun();

        
     }
}
                                     