import java.util.Calendar;
import java.util.TimeZone;

public class GetCurrentTimeInNewYork {

    public static void main(String[] args) {
        // Create a calendar object for the current time in New York
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        // Get the current hour, minute, and second
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Print the current time
        System.out.println("The current time in New York is " + hour + ":" + minute + ":" + second);
    }
}
