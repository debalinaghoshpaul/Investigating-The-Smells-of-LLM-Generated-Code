import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

public class GetYearAndMonthBetweenTwoDates {

    /**
     * Get the year and month between two dates.
     *
     * @param date1 The first date.
     * @param date2 The second date.
     * @return The period between the two dates.
     */
    public static Period getPeriodBetweenDates(LocalDate date1, LocalDate date2) {
        // Calculate the period between the two dates.
        Period period = Period.between(date1, date2);

        return period;
    }

    /**
     * Main method.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Get the two dates from the user.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String date1String = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String date2String = scanner.nextLine();

        // Parse the two dates.
        LocalDate date1 = LocalDate.parse(date1String);
        LocalDate date2 = LocalDate.parse(date2String);

        // Calculate the period between the two dates.
        Period period = getPeriodBetweenDates(date1, date2);

        // Print the period between the two dates.
        System.out.println("The period between the two dates is: " + period);
    }
}

