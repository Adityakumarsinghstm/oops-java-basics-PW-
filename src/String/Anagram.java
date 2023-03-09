package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "School Master";
        String str2 = "The classroom";

        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char []chaar1 = str1.toCharArray();
        char []chaar2 = str2.toCharArray();

        Arrays.sort(chaar1);
        Arrays.sort(chaar2);


        if(Arrays.equals(chaar1,chaar2))
        {
            System.out.println("programme is anagramm...");
        }
        else
        {
            System.out.println("program is not anagram...");
        }
    }
}
