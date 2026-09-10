import java.time.LocalDate;

public class GetDateAfter2Weeks {

    public static void main(String[] args) {
        // Create a LocalDate object for the current date
        LocalDate currentDate = LocalDate.now();

        // Add 14 days to the current date to get the date after 2 weeks
        LocalDate dateAfter2Weeks = currentDate.plusDays(14);

        // Print the date after 2 weeks
        System.out.println("Date after 2 weeks: " + dateAfter2Weeks);
    }
}
