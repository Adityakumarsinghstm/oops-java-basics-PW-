package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(50);
        al.add(100);
        al.add(25);
        al.add(125);
        al.add(75);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Raghu");
        al2.add("Ankit");
        al2.add("Aditya");
        al2.add("Rohit");
        System.out.println(al2);

        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);
        System.out.println(al3);
        /*int index = Collections.binarySearch(al3, 40);
        System.out.println(index);*/
        /*Collections.rotate(al3, 3);
        System.out.println(al3);*/
      /*  Collections.shuffle(al3);
        System.out.println(al3);*/
        System.out.println(Collections.frequency(al3,20));

    }
}
