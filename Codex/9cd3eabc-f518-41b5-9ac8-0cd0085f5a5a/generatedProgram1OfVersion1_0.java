import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercise5 {
    public static void main(String[] args) {
        // Get the current time in New York
        LocalDateTime currentTime = LocalDateTime.now(ZoneId.of("America/New_York"));

        // Format the time using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Print the current time in New York
        System.out.println("Current time in New York: " + formattedTime);
    }
}