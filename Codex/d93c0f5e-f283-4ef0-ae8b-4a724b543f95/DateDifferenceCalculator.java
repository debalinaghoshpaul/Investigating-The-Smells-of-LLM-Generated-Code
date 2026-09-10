import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        // Specify the two dates
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);

        // Calculate the difference between the two dates
        Period period = Period.between(date1, date2);

        // Extract the years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Print the result
        System.out.println("Difference: " + years + " years, " + months + " months, " + days + " days");
    }
}
