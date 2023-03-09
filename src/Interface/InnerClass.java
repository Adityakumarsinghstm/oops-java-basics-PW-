package Interface;
class X
{
    public void show()
    {
        System.out.println("in show...");
    }
    static class Y
    {
        public void display()
        {
            System.out.println("in display...");
        }
    }

}
public class InnerClass {
    public static void main(String[] args) {
        X obj = new X();
        X.Y obj1 = new X.Y();
        obj.show();
        obj1.display();
    }
}
