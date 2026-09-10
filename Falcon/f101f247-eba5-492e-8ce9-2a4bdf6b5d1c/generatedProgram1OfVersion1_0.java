import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year = " + calendar.get(Calendar.YEAR));
        System.out.println("Month = " + calendar.get(Calendar.MONTH));
        System.out.println("Day = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour = " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute = " + calendar.get(Calendar.MINUTE));
    }
}

