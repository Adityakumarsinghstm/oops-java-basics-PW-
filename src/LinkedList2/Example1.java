package LinkedList2;

import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);

        System.out.println(ll1);

        LinkedList ll2 = new LinkedList();
        ll2.add("Pw Skills");
        ll2.add(23);
        ll2.add(2.2);
        System.out.println(ll2);

        LinkedList ll3 = new LinkedList();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);

        ll3.addFirst("pw");
        ll3.addLast(100);
        System.out.println(ll3);

        ll3.add(2, "karpuri thakur");
        System.out.println(ll3);

        System.out.println(ll3.peek());
        System.out.println(ll3);

        System.out.println(ll3.poll());
        System.out.println(ll3);
    }
}
