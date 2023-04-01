package ArrayList2;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1.contains(500));

        int index = al1.indexOf(200);
        System.out.println(index);

        System.out.println(al1.size());

        al1.ensureCapacity(10);
        al1.trimToSize();
        System.out.println(al1.size());
        al1.clear();
        System.out.println(al1);
    }
}
