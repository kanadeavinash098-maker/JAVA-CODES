import java.lang.*;
class Demo
{

}
class same
{
    public static void main(String args[])
    {
        Demo obj=new Demo();
        Demo obj1=new Demo();
        Demo obj2=obj;
        System.out.println(obj.equals(obj1));
        System.out.println(obj.equals(obj2));
    }
}