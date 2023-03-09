package Inheritance;
class Human
{
    int age;
    private String name;
    Human()
    {
        System.out.println("Human class constructor....");
    }
    public void sleep()
    {
        age =34;
        System.out.println("8 hr sleep is mandatory for student....");
    }
}
class Student extends Human
{
    public void display()
    {

        System.out.println("Age of student is : "+age);
    }
}
public class program1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sleep();
        s1.display();
    }
}
