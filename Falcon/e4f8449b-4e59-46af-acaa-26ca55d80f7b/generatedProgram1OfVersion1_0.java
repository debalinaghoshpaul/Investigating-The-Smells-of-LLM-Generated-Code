import java.util.Calendar;

public class DaysInMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int days = 0;
        for (int i = 1; i <= 31; i++) {
            if (cal.get(Calendar.DAY_OF_MONTH) == i) {
                days++;
            }
        }
        System.out.println("Number of days in a month: " + days);
    }
}

