package Multithreading;

import java.util.Scanner;

class Calc extends Thread
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
class Message extends Thread
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
public class Example3 {
    public static void main(String[] args) {
        System.out.println("this is main thread");
        Calc t1 = new Calc();

        Message t2 = new Message();
        t1.start();
        t2.start();
    }
}
