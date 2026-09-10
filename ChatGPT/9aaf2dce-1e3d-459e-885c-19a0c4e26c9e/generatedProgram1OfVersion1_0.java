import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class TimePeriod {

    public static void main(String[] args) {
        // Define a period of time using date-based values
        Period period = Period.of(1, 2, 3); // 1 year, 2 months, 3 days

        // Define a duration of time using time-based values
        Duration duration = Duration.ofHours(1).plusMinutes(30).plusSeconds(15); // 1 hour, 30 minutes, 15 seconds

        // Print the period and duration
        System.out.println("Period: " + period);
        System.out.println("Duration: " + duration);
    }
}
