import java.time.LocalDate;

public class DatesBeforeAndAfter {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Get the date 10 days before today
        LocalDate tenDaysBefore = today.minusDays(10);

        // Get the date 10 days after today
        LocalDate tenDaysAfter = today.plusDays(10);

        // Print the dates
        System.out.println("Today's date: " + today);
        System.out.println("10 days before today: " + tenDaysBefore);
        System.out.println("10 days after today: " + tenDaysAfter);
    }
}
