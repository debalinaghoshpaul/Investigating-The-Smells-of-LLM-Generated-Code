import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {
    public static void main(String[] args) {
        String dateString = "2022-09-15";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("String converted to date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }
}
