import java.lang.*;
class Demo 
{
    public int i; //non-final characterstics
    public final int j = 20; //final characterstics
    public final int k;
    public Demo()  //defolt constructor
    {
        this.i=10;  //initialisation of non-Final charact.
        this.k=30;  //initialisation of final charact.

    
    }
    public Demo(int i, int k) // parameterise constructor
    {
        this.i=i;
        this.k=k;
    }
    public void fun() //function or method and behaviour
    {
        i++;
        j++;
        k++;
    }
}
class Final1
{
    public static void main(String args[]){
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);
        

        Demo obj2 = new Demo(11,21);
        obj2.fun();
        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);
    }

}
    
