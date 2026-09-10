import java.time.Month;
import java.time.Year;

public class MonthsLeftInYear {

    public static void main(String[] args) {
        // Get the current month and year
        Month currentMonth = Month.now();
        Year currentYear = Year.now();

        // Calculate the number of months left in the year
        int monthsLeft = 12 - currentMonth.getValue();

        // Print the number of months left
        System.out.println("There are " + monthsLeft + " months left in the year.");
    }
}
