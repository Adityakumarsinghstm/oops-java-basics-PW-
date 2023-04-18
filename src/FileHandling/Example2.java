package FileHandling;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("pw.txt");
        System.out.println(file1.exists());
        file1.createNewFile();
        System.out.println(file1.exists());

    }
}
