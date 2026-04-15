

class Base {
    public int i; // base characterstics
    public int j;

    public Base() // defoult constructor
    {
        System.out.println("INSIDE THE BASE CONSTRUCTOR....");
    }

    public void fun() // beheviour
    {
        System.out.println("INSIDE BASE FUN...");
    }

    public void fun(int x) // parameterise behaviour or function or methods
    {
        System.out.println("INSIDE BASE FUN WITH INTEGER ARGUMRNT....");
        System.out.println(x);
    }
}

class Derived extends Base // class derived::public BAse
{
    public int x; // derived characterstic
    public int y;

    public Derived() // derived constructor
    {
        System.out.println("INSIDE DERIVED CONSTRUCTOR....");
    }

    public void sun(int x) // parameterised constructor
    {
        System.out.println("INSIDE THE DERIVED SUN...");
        System.out.println(x);
    }
}

public class inheritance1 {
    public static void main(String args[]) {
        System.out.println("INSIDE MAIN...");
        Derived Dobj = new Derived();
        Dobj.fun();
        Dobj.fun(11);
        Dobj.sun(12);

    }
}