package Exception;
class MyException extends Exception
{
    MyException(){}
    MyException(String msg)
    {
        super(msg);
    }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        try
        {
            if (num2 < 0)
            {
                Exception e = new MyException();
                throw e;
            }
            int result = num1/num2;
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println("Enter a valid number....."+ e);
        }

    }
}
