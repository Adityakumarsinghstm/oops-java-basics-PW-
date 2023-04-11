package FailFast;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(123);
        al.add(234);
        al.add(345);
        al.add(456);
        /*for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            al.add(100);
        }*/
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
