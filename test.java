class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class test {
    public static void main(String args[]) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Student age:" + s.getAge());
    }
}