import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get all available time zones
        Set<String> timeZones = ZoneId.getAvailableZoneIds();

        // Get current time in each time zone
        for (String timeZone : timeZones) {
            ZoneId zoneId = ZoneId.of(timeZone);
            LocalDateTime currentTime = LocalDateTime.now(zoneId);
            String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            System.out.println("Time in " + timeZone + ": " + formattedTime);
        }
    }
}