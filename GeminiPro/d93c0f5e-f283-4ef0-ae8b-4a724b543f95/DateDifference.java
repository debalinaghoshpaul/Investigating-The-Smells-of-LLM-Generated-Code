import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Create two LocalDate objects representing two dates
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2021, 12, 31);

        // Calculate the difference between the two dates in years, months, and days
        long years = ChronoUnit.YEARS.between(startDate, endDate);
        long months = ChronoUnit.MONTHS.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        // Print the results
        System.out.println("Difference between the two dates:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
