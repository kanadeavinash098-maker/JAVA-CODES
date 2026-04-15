import java.lang.*;
interface circle
{
 float PI =3.14f;
 float calculatearea(float radius);// prototype
 float calculatecircumfarance(float radius);
    
}
class Area implements circle
{
 public float calculatearea(float radius)
 {
    return(PI * radius * radius);
 }
 public float calculatecircumference(float radius)
 {
    return(2*PI*radius);
 }
}

public class smart 
{
    public static void main(String args[]) 
    {
        //System.out.println("value of PI is :", + circle.PI);
        Area obj =new Area();   
        float fret =0.0f;
        fret =obj.calculatearea(10.5f);
        System.out.println("Area of circle is:"+fret);
        fret =obj.calculatecircumference(10.5f);
        System.out.println("Circumference of circle is:"+fret); 
    }
    
}




// in above example name AS circle circal interface was implimented by the area class circle intrrface cantain two abstract method
// which are define in area class 