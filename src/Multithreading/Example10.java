package Multithreading;
class DeadDemo implements  Runnable
{
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String tName = Thread.currentThread().getName();
        if(tName.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("stu1 has accuired "+res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("stu1 has accuried " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("stu1 has accuried "+res3);
                        }
                    }
                }

            }
            catch(Exception e )
            {
                System.out.println("something went wrong....");
            }

        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized (res3)
                {
                    System.out.println("stu2 has accuired "+res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("stu2 has accuried " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println("stu2 has accuried "+res1);
                        }
                    }
                }

            }
            catch(Exception e )
            {
                System.out.println("something went wrong....");
            }

        }
    }
}
public class Example10 {
    public static void main(String[] args) {
        DeadDemo d1 = new DeadDemo();

        Thread th1 = new Thread(d1);
        Thread th2 = new Thread(d1);

        th1.setName("STUDENT1");
        th2.setName("STUDENT2");

        th1.start();
        th2.start();
    }
}
