import java.lang.*;
class Base
{
  public void fun()
  {
    System.out.println("Inside Base fun..");
  }
  public final void gun()
  {
    System.out.println("Inside  Base gun...");
  }
}
class Derived extends Base
{
   public void fun()// function overriding
  {
    System.out.println("Inside Derived fun...");

  }
   public void gun()
   {
    System.out.println("Inside Derived gun...");
   }



    
}

public class Final2 {
    public static void main(String args[]){
    Derived dobj = new Derived();
    dobj.fun();
    }
    
}
