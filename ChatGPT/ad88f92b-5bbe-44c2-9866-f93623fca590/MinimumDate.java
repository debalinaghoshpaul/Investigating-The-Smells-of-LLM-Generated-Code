import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumDate {

    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = new GregorianCalendar();

        // Get the minimum value of year, month, week, date from the current date
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH);
        int minWeek = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        int minDate = calendar.getMinimum(Calendar.DATE);

        // Print the minimum values
        System.out.println("Minimum year: " + minYear);
        System.out.println("Minimum month: " + minMonth);
        System.out.println("Minimum week: " + minWeek);
        System.out.println("Minimum date: " + minDate);
    }
}
