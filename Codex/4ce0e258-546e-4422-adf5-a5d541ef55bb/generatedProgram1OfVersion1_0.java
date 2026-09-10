import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the desired date
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the Date object from the Calendar instance
        Date date = calendar.getTime();

        // Print the date
        System.out.println("Date: " + date);
    }
}