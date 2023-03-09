package Interface;
interface A
{
    void show();
    default void cofig()
    {
        System.out.println("in cofig..");
    }
    static void abc()
    {
        System.out.println("in abc..");
    }
}
class B implements A{

    public void show() {
        System.out.println("in show..");
    }
}
public class java8fe {
    public static void main(String[] args) {
        A.abc();

        A obj = new B();
        obj.show();
        obj.cofig();
    }
}
