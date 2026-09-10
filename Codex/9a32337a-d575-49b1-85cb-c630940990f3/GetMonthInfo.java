import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetMonthInfo {

    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Get the month name
        String monthName = new SimpleDateFormat("MMMM").format(calendar.getTime());
        System.out.println("Month name: " + monthName);

        // Get the month number
        int monthNumber = calendar.get(Calendar.MONTH) + 1;
        System.out.println("Month number: " + monthNumber);

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Number of days in the month: " + daysInMonth);
    }
}
