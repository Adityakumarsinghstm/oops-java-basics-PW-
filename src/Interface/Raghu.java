package Interface;

public class Raghu extends Student{

    public void walk()
    {
        System.out.println("Student raghu is walking...");
    }

    public static void main(String[] args) {
        a=90;
        Student s2 = new Raghu();
        s2.walk();
        System.out.println(s2.a);
    }
}
