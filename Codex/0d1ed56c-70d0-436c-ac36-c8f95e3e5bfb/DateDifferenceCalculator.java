import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        // Specify the two dates for which you want to calculate the difference
        LocalDateTime date1 = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2022, 1, 1, 14, 30, 0);

        // Calculate the difference between the two dates
        Duration duration = Duration.between(date1, date2);

        // Extract the difference in hours, minutes, milliseconds, and nanoseconds
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long milliseconds = duration.toMillis() % 1000;
        long nanoseconds = duration.toNanos() % 1000000;

        // Print the difference
        System.out.println("Difference: " + hours + " hours, " + minutes + " minutes, " +
                milliseconds + " milliseconds, " + nanoseconds + " nanoseconds");
    }
}
