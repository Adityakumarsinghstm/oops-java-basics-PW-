package Multithreading;

class Printing implements Runnable
{
    public void run() {
        for (int i = 0; i < 2; i++) {
            try
            {
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println("something is wrong");
            }

        }

    }
}
public class Eample7 {
    public static void main(String[] args) throws  Exception{
        System.out.println("main method is started.....");

        Printing p = new Printing();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive());

        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("main thread is ended........");
    }
}
