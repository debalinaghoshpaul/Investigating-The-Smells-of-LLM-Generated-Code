import java.util.Date;

public class GetDate {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis() + (14 * 24 * 60 * 60 * 1000));
        System.out.println("Date after 2 weeks: " + date);
    }
}

