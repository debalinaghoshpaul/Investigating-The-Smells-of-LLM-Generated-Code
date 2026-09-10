import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDiff {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date1 = new Date();
        Date date2 = new Date();
        int hours = sdf.getHours(date1);
        int minutes = sdf.getMinutes(date1);
        int seconds = sdf.getSeconds(date1);
        int milliseconds = sdf.getMilliseconds(date1);
        int nanoseconds = sdf.getNanos(date1);

        int hours2 = sdf.getHours(date2);
        int minutes2 = sdf.getMinutes(date2);
        int seconds2 = sdf.getSeconds(date2);
        int milliseconds2 = sdf.getMilliseconds(date2);
        int nanoseconds2 = sdf.getNanos(date2);

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Milliseconds: " + milliseconds);
        System.out.println("Nanoseconds: " + nanoseconds);
        System.out.println("Hours2: " + hours2);
        System.out.println("Minutes2: " + minutes2);
        System.out.println("Seconds2: " + seconds2);
        System.out.println("Milliseconds2: " + milliseconds2);
        System.out.println("Nanoseconds2: " + nanoseconds2);
    }
}

// 