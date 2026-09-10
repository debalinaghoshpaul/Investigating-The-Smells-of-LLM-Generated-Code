import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exercise12 {
    public static void main(String[] args) {
        // Specify the locale for the desired language
        Locale locale = Locale.US;

        // Get the localized day-of-week names
        String[] dayOfWeekNames = new String[7];
        for (int i = 1; i <= 7; i++) {
            DayOfWeek dayOfWeek = DayOfWeek.of(i);
            String name = dayOfWeek.getDisplayName(TextStyle.FULL, locale);
            dayOfWeekNames[i - 1] = name;
        }

        // Print the localized day-of-week names
        for (String name : dayOfWeekNames) {
            System.out.println(name);
        }
    }
}