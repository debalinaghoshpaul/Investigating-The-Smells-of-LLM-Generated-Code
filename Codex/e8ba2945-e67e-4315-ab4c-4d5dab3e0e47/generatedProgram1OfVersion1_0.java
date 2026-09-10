import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Get the date 10 days before today
        LocalDate beforeDate = today.minusDays(10);
        
        // Get the date 10 days after today
        LocalDate afterDate = today.plusDays(10);
        
        // Print the dates
        System.out.println("10 days before today: " + beforeDate);
        System.out.println("10 days after today: " + afterDate);
    }
}