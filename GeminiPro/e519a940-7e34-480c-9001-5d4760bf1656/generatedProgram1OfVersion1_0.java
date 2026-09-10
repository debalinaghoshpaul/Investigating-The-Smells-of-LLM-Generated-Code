import java.time.LocalDate;
import java.time.LocalDateTime;

public class GetTodaysDateAtMidnight {

    public static void main(String[] args) {
        // Get today's date at midnight
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime midnight = today.withHour(0).withMinute(0).withSecond(0).withNano(0);

        // Print the date
        System.out.println(midnight);
    }
}
