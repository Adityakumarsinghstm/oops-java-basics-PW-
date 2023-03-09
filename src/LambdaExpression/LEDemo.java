package LambdaExpression;
interface Car
{
    void drive(int age,int hs);
}
public class LEDemo {
    public static void main(String[] args) {
      Car obj = (age,hs) -> System.out.println("driving... "+age+" "+hs);

      obj.drive(16,140);
    }
}
