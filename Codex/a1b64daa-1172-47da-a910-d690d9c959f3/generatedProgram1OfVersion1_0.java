import java.time.LocalDate;
import java.time.Period;

public class Exercise19 {
    public static void main(String[] args) {
        // Enter the start and end dates
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        // Calculate the period between the dates
        Period period = Period.between(startDate, endDate);

        // Get the years and months from the period
        int years = period.getYears();
        int months = period.getMonths();

        // Print the result
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
    }
}