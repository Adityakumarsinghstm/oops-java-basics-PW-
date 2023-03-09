package Interface;

public class Student implements  Person{
    static int a=34;
    public void walk()
    {
        System.out.println("student is walking...");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(a);
        s1.walk();
    }
}
