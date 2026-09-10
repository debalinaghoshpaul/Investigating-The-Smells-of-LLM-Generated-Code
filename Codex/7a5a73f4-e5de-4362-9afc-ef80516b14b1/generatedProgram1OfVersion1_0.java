import java.time.LocalDate;

public class Exercise16 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Add 2 weeks to the current date
        LocalDate futureDate = currentDate.plusWeeks(2);
        
        // Print the future date
        System.out.println("Date after 2 weeks: " + futureDate);
    }
}