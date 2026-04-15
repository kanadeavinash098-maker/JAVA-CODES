import java.lang.*;
class command
{
    public static void main(String arg[])
    {
        System.out.println("Number of command line argument:"+arg.length);
        System.out.println("frist number is:"+arg[0]);
        System.out.println("second number:"+arg[1]);
        int ans=Integer.parseInt(arg[0])Integer.parseInt(arg[1]);
        System.out.println("adition is:"+ans); 

    }
}

//javac command.java
// java command 11 21