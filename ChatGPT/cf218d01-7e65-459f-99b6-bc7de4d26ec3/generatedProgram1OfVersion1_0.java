import java.time.LocalDate;
import java.time.Period;

public class DateComparison {

    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get a date before 1 year
        LocalDate oneYearAgo = today.minusYears(1);

        // Get a date after 1 year
        LocalDate oneYearFromNow = today.plusYears(1);

        // Compare the dates to the current date
        boolean isOneYearAgoBeforeToday = oneYearAgo.isBefore(today);
        boolean isOneYearFromNowAfterToday = oneYearFromNow.isAfter(today);

        // Print the results
        System.out.println("One year ago: " + oneYearAgo);
        System.out.println("Is one year ago before today? " + isOneYearAgoBeforeToday);
        System.out.println("One year from now: " + oneYearFromNow);
        System.out.println("Is one year from now after today? " + isOneYearFromNowAfterToday);
    }
}
