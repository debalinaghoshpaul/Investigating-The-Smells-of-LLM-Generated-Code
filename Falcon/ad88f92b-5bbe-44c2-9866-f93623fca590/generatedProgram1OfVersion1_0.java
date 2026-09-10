import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int week = calendar.get(Calendar.WEEK_OF_MONTH);
        int date = calendar.get(Calendar.DATE);

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Week = " + week);
        System.out.println("Date = " + date);
    }
}

