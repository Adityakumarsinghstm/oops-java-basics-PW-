package Interface;
interface Car
{
    void drive();
}
public class AICDemo {
    public static void main(String[] args) {
        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("driving...");
            }
        };
        obj.drive();
    }
}
