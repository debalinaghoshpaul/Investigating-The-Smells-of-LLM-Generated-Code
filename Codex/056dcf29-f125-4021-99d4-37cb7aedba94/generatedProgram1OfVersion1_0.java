import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int remainingMonths = Month.values().length - currentMonth;

        System.out.println("Number of months left in the year: " + remainingMonths);
    }
}