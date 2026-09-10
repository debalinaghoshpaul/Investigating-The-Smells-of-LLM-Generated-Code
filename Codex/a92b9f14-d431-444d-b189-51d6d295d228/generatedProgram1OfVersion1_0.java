import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CombineLocalDateAndTime {

    public static void main(String[] args) {
        // Create a LocalDate object
        LocalDate date = LocalDate.now();

        // Create a LocalTime object
        LocalTime time = LocalTime.now();

        // Combine the date and time into a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        // Print the LocalDateTime object
        System.out.println(dateTime);
    }
}
