package Inheritance;
class Demo1
{
    int a, b;

    Demo1()
    {
        this(56,87);
        System.out.println("non-parametersied parent constructor...");
    }
    Demo1(int x, int y)
    {
        System.out.println("x :"+x+" y: "+y);
        System.out.println("parameterised parent constructor...");
    }
}
class Demo2 extends  Demo1
{
    int m,n;
    Demo2()
    {
        this(12,32);
        System.out.println("non-parameterised child constructor...");
    }
    Demo2(int x, int y)
    {

        System.out.println("parameterised child constructor...");
    }
}
public class program3 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        //Demo2 d22 = new Demo2(45,65);

    }
}
