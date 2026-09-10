import java.text.SimpleDateFormat;
import java.util.Date;

public class UnixTimestampToDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(sdf.format(date));
    }
}

