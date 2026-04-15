import java.lang.*;
class Demo
{}
class classSmart
{
    public static void main(String[] args) 
    {
      Demo dobj= new Demo();
      Class cref=dobj.getClass();    
      System.out.println("class name of object id:"+cref.getName());
      String str ="Smart";
      Class cref1=str.getClass();
      System.out.println("class Name of str is:"+cref1.getName());
    }
}