import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FridayFinder {

    public static void main(String[] args) {
        // Create a LocalDate object for today
        LocalDate today = LocalDate.now();

        // Get the next Friday
        LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        // Get the previous Friday
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        // Print the results
        System.out.println("Next Friday: " + nextFriday);
        System.out.println("Previous Friday: " + previousFriday);
    }
}
