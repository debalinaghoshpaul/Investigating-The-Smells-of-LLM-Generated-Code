import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextPreviousFridays {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextFriday = today.with(DayOfWeek.FRIDAY);
        LocalDate previousFriday = today.with(DayOfWeek.FRIDAY).minusWeeks(1);

        System.out.println("Next Friday: " + nextFriday);
        System.out.println("Previous Friday: " + previousFriday);
    }
}