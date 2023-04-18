package DateAndTimeApi;
import java.time.*;
public class Example2
{
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(date);
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        int monthValue = date.getMonthValue();
        System.out.println(monthValue);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hr = time.getHour();
        System.out.println(hr);

    }
}
