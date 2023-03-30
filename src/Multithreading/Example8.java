package Multithreading;
class Demo4 implements Runnable
{

    public void run() {
        for (int i = 0; i < 3; i++) {
            try
            {
                System.out.println("focus is important....");
                Thread.sleep(2000);
            }
            catch (InterruptedException e )
            {
                System.out.println("Thread is interrupted..");
            }

        }
    }
}
public class Example8 {
    public static void main(String[] args) {
        Demo4 d4 = new Demo4();

        Thread th1 = new Thread(d4);
        th1.start();
        th1.interrupt();
    }
}
