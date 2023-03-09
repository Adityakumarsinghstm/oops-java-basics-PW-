package Exception;
class Demo
{
    public void a() throws ArithmeticException
    {
           b();


    }
    public void b() throws ArithmeticException
    {
        int num1=8;
        int num2=0;

            int result = num1/num2;


    }
}
public class ThrowsKeyword {
    public static void main(String[] args) {
        Demo d = new Demo();
        try
        {
            d.a();
        }catch (ArithmeticException e)
        {
            System.out.println("method handling exception , can't devide by zero....");
        }

    }
}
