package Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
   String coutry() default "India";
   int age() default 23;
}
@CricketPlayer
class Virat
{
    private int innings;
    private int runs;

    public int getInnings() {
        return innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}
public class Example2
{
    public static void main(String[] args) {

        Virat v = new Virat();
        v.setInnings(300);
        v.setRuns(20000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c = v.getClass();
        Annotation a = c.getAnnotation(v.getClass());
        CricketPlayer cp = (CricketPlayer)a;

        String country = cp.coutry();
        System.out.println(country);
        int age = cp.age();
        System.out.println(age);

    }
}
