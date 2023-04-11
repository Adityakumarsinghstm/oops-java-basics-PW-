package Maps;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
    private String name;
    private int eId;

    public Employee(String name, int eId) {
        name = this.name;
        eId = this.eId;
    }
    public String toString()
    {
        return name +" "+ eId;
    }

    @Override
    protected void finalize() {
        System.out.println("cleaning garbages with the help of garbage collector");
    }
}
public class Example5 {
    public static void main(String[] args) {

        Employee emp = new Employee("sanket", 78);
        WeakHashMap hm = new WeakHashMap();
        hm.put(emp, "aditya");
        System.out.println(hm);
        emp = null;
        System.gc();//collecting garbage
        System.out.println(hm);
        System.out.println("last line");

    }
}
