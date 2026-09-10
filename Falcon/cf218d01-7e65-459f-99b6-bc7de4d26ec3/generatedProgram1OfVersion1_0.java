import java.util.Date;

public class CompareDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + (1000 * 365 * 24 * 60 * 60 * 1000));
        System.out.println("Date before 1 year: " + date1);
        System.out.println("Date after 1 year: " + date2);
    }
}

