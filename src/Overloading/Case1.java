package Overloading;
class C{
    public void m1(int i)
    {
        System.out.println("Integral method");
    }
    public void m1(float f)
    {
        System.out.println("float method");
    }
}
public class Case1 {
    public static void main(String[] args) {
        C c = new C();
        c.m1(1);
        c.m1(10f);
        c.m1('a');
        c.m1(19l);
       // c.m1(10.5);  compile time error because method resolution fail
    }
}
