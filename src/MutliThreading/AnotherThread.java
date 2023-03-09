package MutliThreading;

public class AnotherThread extends Thread{
    public void run()
    {
        //Task for thread
        for (int i = 10; i >=0 ; i--) {
            System.out.println("Another thread is :-"+i);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
