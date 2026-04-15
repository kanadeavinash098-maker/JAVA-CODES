class pen{
public void printinfo(String name){
    System.out.println("name");
}

public void  printinfo(int age){
    System.out.println(age);
}

public void printinfo(String name,int age){
    System.out.println(name+" " +age);

}
    

    String name;
    int age;


    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    } 
}
public class oops {
 public static void main(String[] args) {
    Student s1 = new  Student(name);
    s1.name = "avinash";
    s1.age  = 21;

    s1.printinfo(s1.age);
 }
    
}