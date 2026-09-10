import java.util.Calendar;

public class LastDayOfMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(cal.getTime());
    }
}

