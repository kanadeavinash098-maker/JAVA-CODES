import java.lang.*;
import java.io.*;
class stringx
{
    public static void main(String args[])
    {
     String str1="hello";
     String str2="  world";
     System.out.println(str1); //stringliteral
     System.out.println(str2);
     System.out.println(str1.length());//5
     String str3=str1+str2; //concatination
     System.out.println(str3);
     String str5=new String("hello");
     String str6=new String("world"); //new navacha keyword use kel amg to object zala
     String str7 = new String("hello");
     System.out.println("Data is:" +str5);

    }
}