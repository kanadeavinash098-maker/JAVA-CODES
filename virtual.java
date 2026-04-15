import java.lang.*;
class Base
{
    public int i,j;
    public void fun()
    {
        System.out.println("Inside the fun...!");
    }
    public void gun()
    {
        System.out.println("Inside the gun.....!");
    }
    public void sun()
    {
        System.out.println("Inside the sun....!");
    }
}
class Derived
{
    public int x,y;
    public void fun()
    {
        System.out.println("Inside the fun...!");
    }
    public void sun()
    {
        System.out.println("Inside the sun...!");
    }
    public void gun()
    {
        System.out.println("Inside the gun..!");
    }
}
public class virtual 
{
    public static void main(String args[])
    {
       /* Base Bobj=new Base();
        Bobj.fun();
        Bobj.gun();
        Bobj.sun();
        Derived Dobj=new Derived();
        Dobj.fun();
        Base obj= new Base();*/
        Derived obj=new Derived();
        obj.fun();
        obj.gun();
        obj.sun();
    }
    
}
