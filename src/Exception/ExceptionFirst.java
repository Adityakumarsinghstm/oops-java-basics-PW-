package Exception;

public class ExceptionFirst {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        int result=0;
        int[] values = {12,32,43,52};
       try
       {
           result = a/b;
           System.out.println(values[7]);
       }catch (ArithmeticException e)
       {
           System.out.println("can not devided by zero "+e);
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Element not present in Array "+e);
       }


        System.out.println(result);
        System.out.println("Byee....");
    }
}
