package LinkedList;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        Sudent s1 = new Sudent();
        s1.setsId(12);
        s1.setsName("Rahul");
        Sudent s2 = new Sudent();
        s2.setsId(13);
        s2.setsName("Ramesh");

        LinkedList linkedList = new LinkedList();
        linkedList.add(s1);
        linkedList.add(s2);

        System.out.println(linkedList.peek());


    }
}
