import java.util.Date;

public class UnixTimestampToDate {

    public static void main(String[] args) {
        // Create a Unix timestamp
        long timestamp = 1577836800L;

        // Convert the timestamp to a date
        Date date = new Date(timestamp * 1000);

        // Print the date
        System.out.println(date);
    }
}
