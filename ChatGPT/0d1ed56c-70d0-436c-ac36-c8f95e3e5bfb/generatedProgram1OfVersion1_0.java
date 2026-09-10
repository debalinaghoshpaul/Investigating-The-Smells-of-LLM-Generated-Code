import java.time.Duration;
import java.time.ZonedDateTime;

public class DateDifference {

    public static void main(String[] args) {
        // Create two ZonedDateTime objects representing the two dates
        ZonedDateTime date1 = ZonedDateTime.now();
        ZonedDateTime date2 = date1.plusHours(1).plusMinutes(30).plusSeconds(45).plusNanos(123456789);

        // Calculate the difference between the two dates in hours, minutes, milliseconds, and nanoseconds
        Duration duration = Duration.between(date1, date2);

        // Print the results
        System.out.println("Difference in hours: " + duration.toHours());
        System.out.println("Difference in minutes: " + duration.toMinutes());
        System.out.println("Difference in milliseconds: " + duration.toMillis());
        System.out.println("Difference in nanoseconds: " + duration.toNanos());
    }
}
