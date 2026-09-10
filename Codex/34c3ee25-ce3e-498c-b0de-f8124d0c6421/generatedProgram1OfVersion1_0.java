import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentDateAndTime {

    public static void main(String[] args) {
        // Create a LocalDateTime object to represent the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Create a DateTimeFormatter object to specify the desired output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time using the specified formatter
        String formattedDateTime = now.format(formatter);

        // Print the formatted date and time to the console
        System.out.println(formattedDateTime);
    }
}
