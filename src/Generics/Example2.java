package Generics;

import java.util.ArrayList;

class Student
{
    private String name;
    private int id;
}
class Employee
{
    private String name;
    private int id;
}
public class Example2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        Student st1 = new Student();
        Student st2 = new Student();
        Employee em1 = new Employee();
        al.add(st1);
        al.add(st2);
//        al.add(em1);
    }
}
