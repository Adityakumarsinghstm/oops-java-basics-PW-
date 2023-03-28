package Multithreading;

import javax.swing.plaf.TableHeaderUI;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("This is main thread....");
        System.out.println("Before changing.....");
        String thname = Thread.currentThread().getName();
        System.out.println(thname);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("After Changing....." );
        Thread th = Thread.currentThread();
        th.setName("Pw");
        th.setPriority(1);
        String thname1 = Thread.currentThread().getName();
        System.out.println(thname1);
        System.out.println(Thread.currentThread().getPriority());
    }
}
