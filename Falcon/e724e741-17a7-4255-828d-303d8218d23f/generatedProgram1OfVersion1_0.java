import java.util.Calendar;

public class DaysBetweenYears {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(new Date());
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date());
        int days = 0;
        while (cal1.getTime().before(cal2.getTime())) {
            days++;
            cal1.add(Calendar.DAY_OF_YEAR, 1);
            cal2.add(Calendar.DAY_OF_YEAR, -1);
        }
        System.out.println("Number of days between two years: " + days);
    }
}

