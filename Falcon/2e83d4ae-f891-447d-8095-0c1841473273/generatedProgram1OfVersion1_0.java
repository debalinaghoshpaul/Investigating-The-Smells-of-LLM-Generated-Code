import java.util.Locale;

public class DayOfWeek {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        System.out.println("Monday: " + locale.getDayOfWeek(Calendar.MONDAY));
        System.out.println("Tuesday: " + locale.getDayOfWeek(Calendar.TUESDAY));
        System.out.println("Wednesday: " + locale.getDayOfWeek(Calendar.WEDNESDAY));
        System.out.println("Thursday: " + locale.getDayOfWeek(Calendar.THURSDAY));
        System.out.println("Friday: " + locale.getDayOfWeek(Calendar.FRIDAY));
        System.out.println("Saturday: " + locale.getDayOfWeek(Calendar.SATURDAY));
        System.out.println("Sunday: " + locale.getDayOfWeek(Calendar.SUNDAY));
    }
}

// 