import java.util.Calendar;

public class DateGenerator {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        System.out.println(cal.getTime());
    }
}

