import java.time.LocalDate;

public class Exercise6 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the last day of the current month
        int lastDayOfMonth = currentDate.lengthOfMonth();

        System.out.println("Last day of the current month: " + lastDayOfMonth);
    }
}