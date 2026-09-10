import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatting {

    public static void main(String[] args) {
        // Creating a Date object
        Date date = new Date();

        // Creating a SimpleDateFormat object with the desired date and time format pattern
        SimpleDateFormat sdf;

        // Printing the date and time in different formats
        System.out.println("yyyy-MM-dd:");
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        System.out.println("HH:mm:ss:");
        sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(date));

        System.out.println("yyyy-MM-dd HH:mm:ss:");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        System.out.println("E MMM yyyy HH:mm:ss.SSSZ:");
        sdf = new SimpleDateFormat("E MMM yyyy HH:mm:ss.SSSZ");
        System.out.println(sdf.format(date));

        System.out.println("HH:mm:ss,Z:");
        sdf = new SimpleDateFormat("HH:mm:ss,Z");
        System.out.println(sdf.format(date));
    }
}
