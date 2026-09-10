import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {

    public static void main(String[] args) {
        // Test cases
        String date1 = "2023-03-08";
        String date2 = "2023-03-12";
        
        // Corner cases
        String invalidDate1 = "2023-03-32";
        String invalidDate2 = "2023-02-29";
        
        // Calculate the difference between two dates in days
        int days = calculateDateDifference(date1, date2);
        System.out.println("Difference between " + date1 + " and " + date2 + " in days: " + days);
        
        // Handle invalid date formats
        try {
            calculateDateDifference(invalidDate1, invalidDate2);
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }

    public static int calculateDateDifference(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(date1);
        Date d2 = sdf.parse(date2);
        long diff = d2.getTime() - d1.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
}
