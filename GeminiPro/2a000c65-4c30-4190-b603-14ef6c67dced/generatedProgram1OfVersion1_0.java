import java.time.LocalDate;

public class GetLastDateOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get the last date of the current month
        LocalDate lastDateOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        // Print the last date of the month
        System.out.println("The last date of the month is: " + lastDateOfMonth);
    }
}
