package Multithreading;
interface cent
{

}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("This is child thread");
        System.out.println(Thread.NORM_PRIORITY);
    }

}
public class Example2 {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t = new MyThread();
        t.start();
    }
}
