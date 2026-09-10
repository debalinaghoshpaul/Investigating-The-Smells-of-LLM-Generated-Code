import java.util.Calendar;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2016;
        int month = 2;
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("February " + year + " has " + days + " days.");
    }
}

// 