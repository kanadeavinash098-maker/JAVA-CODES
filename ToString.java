import java.lang.*;
class Demo
{
    String name;
    String age;
    public Demo(String name,String age)
    {
        this.name=name;
        this.age=age;
    }
                     
    public static void main(String args[])
    {
    Demo Dobj = new Demo("akash", "22");
    System.out.println(Dobj.toString());
    }
}