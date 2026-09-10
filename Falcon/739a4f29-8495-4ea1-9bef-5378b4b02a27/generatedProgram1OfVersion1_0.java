import java.time.LocalDate;
import java.time.LocalTime;

public class DisplayDateAndTime {

    public static void main(String[] args) {
        // Get the current date without time
        LocalDate date = LocalDate.now();
        System.out.println("Current date without time: " + date);

        // Get the current time without date
        LocalTime time = LocalTime.now();
        System.out.println("Current time without date: " + time);
    }
}
