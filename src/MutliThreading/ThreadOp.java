package MutliThreading;

import java.util.concurrent.ThreadLocalRandom;
 class UserThread extends Thread{
     public void run()
     {
         System.out.println("This is User Defined Thread...");
     }
 }
public class ThreadOp {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread Started...");
        String name = t.getName();
        System.out.println(name);
        t.setName("Mymain");
        System.out.println(t.getName());
        System.out.println(t.getId());
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("Thread ended...");
    }
}
