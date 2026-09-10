import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCalculator {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Get the number of hours and minutes to subtract
        int hoursToSubtract = 2;
        int minutesToSubtract = 30;

        // Subtract the hours and minutes from the current date and time
        LocalDateTime previous = now.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedPrevious = previous.format(formatter);

        // Print the previous date and time
        System.out.println("The date and time " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes ago was: " + formattedPrevious);
    }
}
