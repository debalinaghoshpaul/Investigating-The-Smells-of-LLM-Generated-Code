import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the number of hours and minutes to subtract
        int hoursToSubtract = 2;
        int minutesToSubtract = 30;

        // Subtract the hours and minutes from the current date and time
        LocalDateTime newDateTime = currentDateTime.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);

        // Format the new date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = newDateTime.format(formatter);

        // Display the new date and time
        System.out.println("Date and Time before " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes: " + formattedDateTime);
    }
}
