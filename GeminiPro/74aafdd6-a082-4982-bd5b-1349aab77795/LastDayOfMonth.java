import java.time.LocalDate;

public class LastDayOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get the last day of the current month
        LocalDate lastDayOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        // Print the last day of the current month
        System.out.println("Last day of the current month: " + lastDayOfMonth);
    }
}
