package DateAndTimeApi;

import java.sql.Time;
import java.util.Date;


public class Example1 {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        long  dateInMs = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(dateInMs);
        System.out.println(dt1);

        java.sql.Time t1 = new java.sql.Time(dateInMs);
        System.out.println(t1);

        java.sql.Timestamp ts = new java.sql.Timestamp(dateInMs);
        System.out.println(ts);

    }
}
