package Interface;
interface Calc
{
    void display();
}
class Demo implements Calc
{
    public void display()
    {
        System.out.println("This is interface method");

    }
}
public class Launch1 {

    public static void main(String[] args) {
        Calc c = new Demo();
        c.display();
    }
}
