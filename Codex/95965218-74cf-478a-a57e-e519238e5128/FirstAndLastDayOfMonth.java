import java.util.Calendar;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current month
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);

        // Get the first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("First day of the month: " + calendar.getTime());

        // Get the last day of the month
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Last day of the month: " + calendar.getTime());
    }
}
