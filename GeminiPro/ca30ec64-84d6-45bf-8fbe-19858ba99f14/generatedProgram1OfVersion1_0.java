import java.util.Calendar;
import java.util.TimeZone;

public class PrintCurrentTimeInGMT {

    public static void main(String[] args) {
        // Create a calendar object and set it to the current time in GMT.
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        // Get the current time from the calendar.
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Print the current time to the console.
        System.out.println("Current time is " + hour + ":" + minute + ":" + second);
    }
}
