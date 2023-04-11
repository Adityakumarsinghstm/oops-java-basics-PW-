package Maps;

import com.sun.jdi.Value;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, "Ramesh");
        hm1.put(2, "suresh");
        hm1.put(3, "mahesh");
        hm1.put(4, "kamles");
        System.out.println(hm1.get(3));

        Set keySet = hm1.keySet();
       Iterator itr = keySet.iterator();
       while (itr.hasNext())
       {
//           System.out.println(itr.next());
           int key = (Integer)itr.next();
           System.out.println(key);
       }

       Collection clc = hm1.values();
       Iterator itr2 = clc.iterator();
       while (itr2.hasNext())
       {
//           System.out.println(itr2.next());
           String name = (String)itr2.next();
           System.out.println(name);
       }

       Set entry = hm1.entrySet();
       Iterator itr3 = entry.iterator();
       while (itr3.hasNext())
       {
//           System.out.println(itr3.next());
           Map.Entry data = (Map.Entry) itr3.next();
           System.out.println(data.getKey()+ " : "+data.getValue());
       }
    }
}
