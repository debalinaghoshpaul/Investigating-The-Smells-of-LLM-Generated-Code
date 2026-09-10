import java.util.Calendar;

public class Exercise4 {
    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Get the minimum values
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDate = calendar.getActualMinimum(Calendar.DATE);

        // Print the minimum values
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week: " + minWeek);
        System.out.println("Minimum Date: " + minDate);
    }
}