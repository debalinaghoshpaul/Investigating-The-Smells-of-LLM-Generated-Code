import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateConverter {

    public static void main(String[] args) throws ParseException {
        // Sample dates and time in string format
        String dateString1 = "2023-03-08";
        String dateString2 = "08/03/2023 14:30:00";

        // Convert string to date
        DateFormat dateFormatter1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dateFormatter1.parse(dateString1);

        DateFormat dateFormatter2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date2 = dateFormatter2.parse(dateString2);

        // Print the converted dates
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        // Convert date to string
        String formattedDate1 = dateFormatter1.format(date1);
        String formattedDate2 = dateFormatter2.format(date2);

        // Print the formatted dates
        System.out.println("Formatted Date 1: " + formattedDate1);
        System.out.println("Formatted Date 2: " + formattedDate2);
    }
}
