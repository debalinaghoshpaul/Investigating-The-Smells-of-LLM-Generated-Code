import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss, yyyy-MM-dd HH:mm:ss, E MMM yyyy HH:mm:ss.SSSZ, HH:mm:ss,Z");
        System.out.println(sdf.format(date));
    }
}

