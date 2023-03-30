package Multithreading;
class Car implements  Runnable
{

    public void run() {
        try
        {
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(2000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " Got into car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " came back and parked the car");
            }


        }
        catch(Exception e)
        {
            System.out.println("something went wrong...");
        }

    }
}
public class Example9 {
    public static void main(String[] args) {
        Car c = new Car();

        Thread th1 = new Thread(c);
        Thread th2 = new Thread(c);
        Thread th3 = new Thread(c);

        th1.setName("son-1");
        th2.setName("son-2");
        th3.setName("son-3");

        th1.start();
        th2.start();
        th3.start();

    }

}
