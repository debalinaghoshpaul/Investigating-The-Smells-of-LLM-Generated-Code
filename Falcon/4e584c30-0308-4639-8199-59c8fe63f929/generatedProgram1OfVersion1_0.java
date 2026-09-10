import java.util.Date;

public class DateDifference {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        int days = (int) (date2.getTime() - date1.getTime());
        System.out.println("Difference in days: " + days);
    }
}

