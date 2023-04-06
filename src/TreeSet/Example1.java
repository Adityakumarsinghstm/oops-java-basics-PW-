package TreeSet;

import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(75);
        ts.add(150);
        ts.add(25);
        ts.add(175);
        ts.add(50);
        ts.add(125);
        System.out.println(ts);
        /*ts.add(100);
        System.out.println(ts);*/
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        System.out.println(ts.ceiling(90));
        System.out.println(ts.floor(90));

    }
}
