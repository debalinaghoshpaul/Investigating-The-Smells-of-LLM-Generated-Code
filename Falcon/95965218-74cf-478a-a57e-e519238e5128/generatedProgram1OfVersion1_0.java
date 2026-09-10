import java.util.Calendar;
import java.util.Date;

public class GetFirstLastDay {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date firstDay = cal.getTime();
        Date lastDay = cal.getTime();
        System.out.println("First day of the month is: " + firstDay);
        System.out.println("Last day of the month is: " + lastDay);
    }
}

