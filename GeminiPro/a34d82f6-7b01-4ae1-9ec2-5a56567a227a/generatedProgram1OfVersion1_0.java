import java.util.TimeZone;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zones in UTC
        String[] utcTimeZones = TimeZone.getAvailableIDs("UTC");
        System.out.println("UTC Time Zones:");
        for (String timeZone : utcTimeZones) {
            System.out.println(timeZone);
        }

        // Get all available time zones in GMT
        String[] gmtTimeZones = TimeZone.getAvailableIDs("GMT");
        System.out.println("\nGMT Time Zones:");
        for (String timeZone : gmtTimeZones) {
            System.out.println(timeZone);
        }
    }
}
