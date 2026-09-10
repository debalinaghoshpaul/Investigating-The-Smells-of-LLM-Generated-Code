import java.time.LocalDate;
import java.time.YearMonth;

public class Exercise8 {
    public static void main(String[] args) {
        // Get the current year and month
        YearMonth yearMonth = YearMonth.now();
        int year = yearMonth.getYear();
        int month = yearMonth.getMonthValue();

        // Get the last date of the month
        LocalDate lastDateOfMonth = yearMonth.atEndOfMonth();

        // Print the last date of the month
        System.out.println("Last date of the month: " + lastDateOfMonth);
    }
}