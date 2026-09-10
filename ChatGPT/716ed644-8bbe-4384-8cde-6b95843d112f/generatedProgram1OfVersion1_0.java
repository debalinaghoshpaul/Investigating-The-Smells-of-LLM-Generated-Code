import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {

    public static void main(String[] args) {
        // Create a calendar object
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to a specific date
        calendar.set(2023, 2, 15);

        // Get the day of the week as a number
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the day of the week to a string
        String dayOfWeekString = "";
        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "Sunday";
                break;
            case 2:
                dayOfWeekString = "Monday";
                break;
            case 3:
                dayOfWeekString = "Tuesday";
                break;
            case 4:
                dayOfWeekString = "Wednesday";
                break;
            case 5:
                dayOfWeekString = "Thursday";
                break;
            case 6:
                dayOfWeekString = "Friday";
                break;
            case 7:
                dayOfWeekString = "Saturday";
                break;
        }

        // Print the day of the week
        System.out.println("The day of the week is: " + dayOfWeekString);
    }
}
