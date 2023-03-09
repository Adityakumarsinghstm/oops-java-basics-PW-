package Overriding;
class Parent{
    public void property()
    {
        System.out.println("cash,gold,land");
    }
    public void marry()
    {
        System.out.println("parent method: apallama, subhlakhsmi");
    }
}
class Child extends Parent{
    public void marry()
    {
        System.out.println("Child method: Katrina Kaif");
    }
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
           p.marry();
           Child c = new Child();
           c.marry();
        Parent p1 = new Child();
        p1.marry();
    }

}
