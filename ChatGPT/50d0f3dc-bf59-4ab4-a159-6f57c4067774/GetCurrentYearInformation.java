import java.time.LocalDate;
import java.time.Year;

public class GetCurrentYearInformation {
    public static void main(String[] args) {
        // Getting the current year information
        Year currentYear = Year.now();

        // Printing the current year information
        System.out.println("Current year: " + currentYear);
        System.out.println("Is current year a leap year? " + currentYear.isLeap());
        System.out.println("Length of current year in days: " + currentYear.length());

        // Getting the information of a given year
        int givenYear = 2020;
        Year year = Year.of(givenYear);

        // Printing the given year information
        System.out.println("\nGiven year: " + year);
        System.out.println("Is given year a leap year? " + year.isLeap());
        System.out.println("Length of given year in days: " + year.length());
    }
}
