import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetLocalizedDayOfWeeks {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Get the day-of-week names in the default locale
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        for (DayOfWeek dayOfWeek : daysOfWeek) {
            String localizedName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.println(localizedName);
        }

        // Get the day-of-week names in a specific locale
        Locale locale = Locale.FRANCE;
        for (DayOfWeek dayOfWeek : daysOfWeek) {
            String localizedName = dayOfWeek.getDisplayName(TextStyle.FULL, locale);
            System.out.println(localizedName);
        }
    }
}
