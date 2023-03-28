package Multithreading;
class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("child thread is starting.....");
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.......");
        }
        System.out.println("Child thread is completed......");
    }
}
public class Example6 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Thread th1 = new Thread(d);

        th1.start();
    }
}
