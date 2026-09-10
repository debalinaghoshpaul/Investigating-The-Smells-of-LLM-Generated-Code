import java.util.Calendar;

public class MaxDate {

    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Get the maximum value of the year
        int maxYear = calendar.getMaximum(Calendar.YEAR);

        // Get the maximum value of the month
        int maxMonth = calendar.getMaximum(Calendar.MONTH);

        // Get the maximum value of the week
        int maxWeek = calendar.getMaximum(Calendar.WEEK_OF_YEAR);

        // Get the maximum value of the date
        int maxDate = calendar.getMaximum(Calendar.DAY_OF_MONTH);

        // Print the maximum values
        System.out.println("Maximum year: " + maxYear);
        System.out.println("Maximum month: " + maxMonth);
        System.out.println("Maximum week: " + maxWeek);
        System.out.println("Maximum date: " + maxDate);
    }
}
