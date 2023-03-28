package Multithreading;

import java.util.Scanner;

class Calci implements Runnable
{
    public void run()
    {
        System.out.println("calculation program start.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("The result is :"+result);

        System.out.println("Calculation program end...");
    }
}
class Messages implements Runnable
{
    public void run()
    {
        System.out.println("message program start.....");
        try
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is the key of success...");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println("something went wrong...");
        }

        System.out.println("message program end.....");
    }
}
public class Example4 {
    public static void main(String[] args) {

        Calci c1 = new Calci();
        Messages m1 = new Messages();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();
    }
}
