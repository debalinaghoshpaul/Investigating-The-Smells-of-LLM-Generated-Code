import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthInfo {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the month name and year
        String monthName = currentDate.getMonth().name();
        int year = currentDate.getYear();

        // Format the month name
        String formattedMonthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();

        // Print the month information
        System.out.println("Current month: " + formattedMonthName);
        System.out.println("Current year: " + year);
    }
}