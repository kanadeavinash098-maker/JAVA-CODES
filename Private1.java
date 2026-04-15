import java.lang.*;
class human
{
    private String Name;
    public void sname(String Name)
    {
        this.Name=Name;
    }
    public String gname()
    {
        return  Name;
    }
}
public class Private1 {
    public static void main(String[] args)
    {
    human obj= new human();
    obj.sname("Avinash");
    //System.out.println(obj.Name); //
    System.out.println(obj.gname());
    }
}
