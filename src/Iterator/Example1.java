package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(23);
        al1.add(50);
        al1.add(79);
       /* for (int i = 0; i < al1.size(); i++) {
            Object obj = al1.get(i);
            System.out.println(obj);
        }*/

       /* for (Object obj:al1) {
            System.out.println(obj);
        }*/

        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            int value = (Integer) itr.next();
            System.out.println(value);
        }
        ListIterator litr = al1.listIterator(al1.size());
        while (litr.hasPrevious()) {
            int i = (Integer)litr.previous();
            System.out.println(i);
        }
    }
}
