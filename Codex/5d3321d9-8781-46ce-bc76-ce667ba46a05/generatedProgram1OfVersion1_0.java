import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise9 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        
        // Calculate the first day of the current week
        LocalDate firstDayOfWeek = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        
        // Calculate the last day of the current week
        LocalDate lastDayOfWeek = currentDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        
        System.out.println("First day of the week: " + firstDayOfWeek);
        System.out.println("Last day of the week: " + lastDayOfWeek);
    }
}