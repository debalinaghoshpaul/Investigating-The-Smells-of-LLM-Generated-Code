import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise13 {
    public static void main(String[] args) {
        // Specify the date
        int year = 2022;
        int month = 9; // 1 for January, 2 for February, and so on
        int day = 1;

        // Create a LocalDate object
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the day of the week
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
