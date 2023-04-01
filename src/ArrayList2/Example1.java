package ArrayList2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        /*System.out.println(al1.add(100));*/
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("PW Skills");
        al2.add(1);
        al2.add(1.2);
        al2.add('j');
        System.out.println(al2);

        al2.add(100);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.addAll(al2);

        System.out.println(al3);

        al3.add(2, "aditya");
        System.out.println(al3);
        al3.remove(2);
        System.out.println(al3);

    }
}
