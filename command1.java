import java.lang.*;
class command1
{
    public static void main(String arg[])
    {
        System.out.println("number of command line arguments is:"+arg.length);
        System.out.println("frist number is:"+arg[0]);
        System.out.println("Second number is:"+arg[1]);
        int ans=Integer.parseInt(arg[0])+Integer.parseInt(arg[1]);
        System.out.println("Adition is:"+ans);
    }
}