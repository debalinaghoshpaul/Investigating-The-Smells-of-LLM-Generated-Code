import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise15 {
    public static void main(String[] args) {
        // Get the current time
        LocalDateTime currentTime = LocalDateTime.now();

        // Add hours to the current time
        int hoursToAdd = 3;
        LocalDateTime newTime = currentTime.plusHours(hoursToAdd);

        // Format the new time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = newTime.format(formatter);

        // Print the new time
        System.out.println("Current Time: " + currentTime);
        System.out.println("New Time after adding " + hoursToAdd + " hours: " + formattedTime);
    }
}