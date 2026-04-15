import java.lang.*;
class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int Esalary;
    public Employee(int id,String str, int no)
    {
        this.EID= id;
        this.Ename= str;
        this.Esalary= no;
    }
    public Object Clone()throws CloneNotSupportedException
    {
    return super.clone();
    }
}
public class copy
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Employee eobj=new Employee(11,"Avinash",25000);
        System.out.println("Employee id:"+eobj.EID+"Name"+eobj.Ename+"salary"+eobj.Esalary);
        try
        {
            Employee eobjx=(Employee)eobj.Clone();
            System.out.println("cloned ID:"+eobjx.EID+"Name:"+eobjx.Ename+"salary:"+eobjx.Esalary);
            eobj.Ename="rajesh";
            System.out.println("orignal name:"+eobj.Ename);
            System.out.println("cloned Name:"+eobjx.Ename);



        }
        catch(CloneNotSupportedException obj)
        {

        }
    }
        
    
}
