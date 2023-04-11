package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

public class Example2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(2, "Rahul");
        hm.put(18, "virat Kohli");
        hm.put("parwana","jahana");
        System.out.println(hm);

        HashMap hm2 = new HashMap();
        hm2.put(90, "Dhoni");
        hm2.putAll(hm);
        System.out.println(hm2);

        Iterator itr = hm.values().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("kohli", "virat");
        lhm.put("sharma", "Rohit");
        lhm.put("Rahul", "KL");
        System.out.println(lhm);

    }
}
