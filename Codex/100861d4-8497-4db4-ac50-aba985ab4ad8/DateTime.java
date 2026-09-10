import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
  
public class DateTime {  
    public static void main(String[] args) {  
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();  
  
        // Format the date and time in a specific format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        String formattedDateTime = now.format(formatter);  
  
        // Display the current date and time
        System.out.println("The current date and time is: " + formattedDateTime);  
    }  
}  
