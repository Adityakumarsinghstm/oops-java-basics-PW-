package Multithreading;

import java.util.Scanner;

class Demo extends Thread
{
    public void run() {
       String tName = Thread.currentThread().getName();
       if(tName.equals("CALC"))
       {
           calc();
       }
       else
       {
           message();
       }
    }
    public void calc()
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
    public void message()
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
public class Example5 {
    public static void main(String[] args) {
   Demo thread1 = new Demo();
   Demo thread2 = new Demo();

   thread1.setName("CALC");
   thread2.setName("PRINT");

   thread1.start();
   thread2.start();
    }
}
