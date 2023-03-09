package Injection;

class Human
{
    private Student stu1;
    Human(Student stu1)
    {
        this.stu1=stu1;
    }
    public void call()
    {
        stu1.study();
    }
}
class Student
{
    public void study()
    {
        System.out.println("student is studying...");
    }
}
public class Project1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Human h1 = new Human(s1);
        h1.call();
    }
}
