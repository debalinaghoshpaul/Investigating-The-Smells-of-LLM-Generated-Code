import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentLocalTime {

    public static void main(String[] args) {
        // Get the current local time
        LocalDateTime currentTime = LocalDateTime.now();

        // Format the time in a human-readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Print the formatted time
        System.out.println("Current local time: " + formattedTime);
    }
}
