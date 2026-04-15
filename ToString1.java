import java.lang.*;
public class ToString1
{
    String name;
    String age;
    public ToString1(String name,String age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
    return name+age;
    }
    public static void main(String[] args) {
        ToString1 Tobj =new ToString1("rakesh", "   55");
        System.out.println(Tobj.toString());
    }
    
}