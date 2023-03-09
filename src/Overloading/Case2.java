package Overloading;

public class Case2 {
    public void m1(Object obj)
    {
        System.out.println("Object Version");
    }
    public void m1(String s)
    {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        Case2 c2 = new Case2();
        c2.m1(new Object());
        c2.m1("Rahul");
        c2.m1(null);
    }
}
