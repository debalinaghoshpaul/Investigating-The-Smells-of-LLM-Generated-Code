import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}

// 