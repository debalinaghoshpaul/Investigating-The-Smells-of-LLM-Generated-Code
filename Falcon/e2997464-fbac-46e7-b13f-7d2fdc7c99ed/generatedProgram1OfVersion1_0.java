import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime {
    public static void main(String[] args) {
        String dateString = "2020-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        System.out.println("Date: " + date);
    }
}

