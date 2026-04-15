import java.lang.*;
import java.awt.*;
class frame2
{
    public static void main(String args[]) 
    {
    System.out.println("print the data on console.");
    smartframe sobj=new smartframe("java");
    }
}
class smartframe
{
public Frame sobj;
public smartframe(String name)
{
    sobj = new Frame(name);
    sobj.setSize(600,600);
    sobj.setVisible(true);
}
    
}