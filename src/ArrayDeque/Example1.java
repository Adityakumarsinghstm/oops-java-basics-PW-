package ArrayDeque;

import java.util.ArrayDeque;

public class Example1 {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);
        ad1.add("aditya");
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerFirst("muskan");
        ad1.offerLast("shefali");
        System.out.println(ad1);
    }
}
