import java.lang.*;

class Demo {
    public int Arr[];

    public Demo(int Size) {
        System.out.println("Allocating the resources in cunstarctar....");
        
        this.Arr = new int[Size];

    }

    protected void Finalize() {
        System.out.println("Deallocating the resources in finalize....");
        ;
        this.Arr = null;
    }
}

class garbagecollectar
{
    public static void main(String args[]) {
        Demo Dobj = new Demo(10);
        Dobj = null;
        System.gc();
        System.out.println("End of main....");

    }
}
