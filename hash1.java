import java.lang.*;
class Demo
{

}
class hash1
{
    public static void main(String args[])
    {
        String str1="Rakesh";
        String str2="Rajesh";
        String str3="harshal";
        Demo dobj=new Demo();
        System.out.println("hashcode of str1:"+str1.hashCode());
        System.out.println("hashcode of str2:"+str2.hashCode());
        System.out.println("hashcode of str3"+str3.hashCode());
        System.out.println("hashcode of dobj:"+dobj.hashCode());
    }
}