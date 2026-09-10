import java.time.LocalDate;
import java.time.YearMonth;

public class Exercise10 {
    public static void main(String[] args) {
        // Specify the year and month
        int year = 2022;
        int month = 9;

        // Create a YearMonth object
        YearMonth yearMonth = YearMonth.of(year, month);

        // Get the first day of the month
        LocalDate firstDay = yearMonth.atDay(1);
        System.out.println("First day of the month: " + firstDay);

        // Get the last day of the month
        LocalDate lastDay = yearMonth.atEndOfMonth();
        System.out.println("Last day of the month: " + lastDay);
    }
}