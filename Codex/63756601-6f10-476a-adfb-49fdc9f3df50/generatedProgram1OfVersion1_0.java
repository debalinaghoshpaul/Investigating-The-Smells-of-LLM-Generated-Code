import java.util.Calendar;

public class Exercise3 {
    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Get the maximum value for the year
        int maxYear = calendar.getActualMaximum(Calendar.YEAR);
        System.out.println("Maximum Year: " + maxYear);

        // Get the maximum value for the month
        int maxMonth = calendar.getActualMaximum(Calendar.MONTH) + 1; // Adding 1 because months are zero-based
        System.out.println("Maximum Month: " + maxMonth);

        // Get the maximum value for the week
        int maxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum Week: " + maxWeek);

        // Get the maximum value for the date
        int maxDate = calendar.getActualMaximum(Calendar.DATE);
        System.out.println("Maximum Date: " + maxDate);
    }
}