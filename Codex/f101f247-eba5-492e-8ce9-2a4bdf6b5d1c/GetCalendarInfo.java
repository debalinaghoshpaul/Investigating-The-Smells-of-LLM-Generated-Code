import java.util.Calendar;

public class GetCalendarInfo {

    public static void main(String[] args) {
        // Get a default calendar
        Calendar calendar = Calendar.getInstance();

        // Get and display information about the calendar
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based
        System.out.println("Day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }
}
