package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student
{
    private String name;
    private int age;
    private String city;

     public Student(String name, int age, String city )
    {
        name = this.name;
        age = this.age;
        city = this.city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String toString() {
        return name + " "+ age +" "+city;
    }
}

public class Example4 {
    public static void main(String[] args) {

        Student stu1 = new Student("aditya", 21, "patna");
        Student stu2 = new Student("Rohit", 25, "Banguluru");
        Student stu3 = new Student("Ankit",21,"Delhi");
        HashMap hm1 = new HashMap();
        hm1.put(1, stu1);
        hm1.put(2, stu2);
        hm1.put(3, stu3);
        System.out.println(hm1);

    }
}
