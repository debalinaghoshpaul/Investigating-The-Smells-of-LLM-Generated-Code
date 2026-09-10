import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.*;

public class DateTimeExtractor {

    public static void main(String[] args) {
        String dateString = "2023-03-08 12:34:56";
        // Create a SimpleDateFormat object to parse the date string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Parse the date string into a Date object
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Create a TemporalAccessor object to extract the date and time components
        TemporalAccessor ta = date.toInstant().atZone(ZoneId.systemDefault()).toTemporal();
        // Extract the date and time components
        int year = ta.get(ChronoField.YEAR);
        int month = ta.get(ChronoField.MONTH_OF_YEAR);
        int day = ta.get(ChronoField.DAY_OF_MONTH);
        int hour = ta.get(ChronoField.HOUR_OF_DAY);
        int minute = ta.get(ChronoField.MINUTE_OF_HOUR);
        int second = ta.get(ChronoField.SECOND_OF_MINUTE);

        // Print the date and time components
        System.out.println("Date components: " + year + "-" + month + "-" + day);
        System.out.println("Time components: " + hour + ":" + minute + ":" + second);
    }
}
