package Enum;
enum week
{
    MON, TUE, WED, THR, FRI, SAT, SUN;
}
public class Example1
{
    public static void main(String[] args) {
        week w = week.THR;
        System.out.println(w);

        System.out.println(w.ordinal());

        week wr[] = week.values();
        for (week w1:wr) {
            System.out.println(w1+" : "+w1.ordinal());
        }
    }
}
