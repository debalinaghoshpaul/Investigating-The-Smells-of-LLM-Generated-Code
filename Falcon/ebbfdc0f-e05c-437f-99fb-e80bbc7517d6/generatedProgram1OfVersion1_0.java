import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(date);
        System.out.println(dateTime);
    }
}

