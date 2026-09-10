import java.util.*;

public class TimeInfo {

    public static void main(String[] args) {
        // Create a Calendar object
        Calendar calendar = Calendar.getInstance();

        // Get the current time
        Date date = calendar.getTime();

        // Print the current time
        System.out.println("Current time: " + date);

        // Get the year, month, and day
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Print the year, month, and day
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // Get the hour, minute, and second
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Print the hour, minute, and second
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
