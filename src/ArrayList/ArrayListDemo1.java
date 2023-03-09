package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Integer i =12;
        ArrayList a = new ArrayList();
        a.add(i);
        a.add("Sintu");
        System.out.println(a);
        a.set(0,78);
        System.out.println(a);
        System.out.println(a.size());
        a.remove(0);
        System.out.println(a);
        System.out.println(a.size());


    }
}
