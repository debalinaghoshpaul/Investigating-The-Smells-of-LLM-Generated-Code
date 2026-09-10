import java.util.Calendar;
import java.util.Date;

public class CreateDateUsingCalendar {

    public static void main(String[] args) {
        // Create a Calendar object
        Calendar calendar = Calendar.getInstance();

        // Set the year, month, day, hour, minute, and second
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);

        // Create a Date object using the Calendar object
        Date date = calendar.getTime();

        // Print the Date object
        System.out.println(date);
    }
}
