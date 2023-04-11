package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Rahul");
        //hm.put(2, "sanjay");
        ht.put(3, "sobhit");
        ht.putIfAbsent(2, "sohan");
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(1, "kumar");
        tm.put(2, "sharma");
        tm.put(3, "dubey");
        System.out.println(tm);
    }
}
