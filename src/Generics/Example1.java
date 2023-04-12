package Generics;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("rohit");
        al.add("Pramod");
//        al.add(23);
        String name1 = (String) al.get(0);
        String name2 = (String) al.get(1);
//        String value = (String) al.get(2);


    }
}
