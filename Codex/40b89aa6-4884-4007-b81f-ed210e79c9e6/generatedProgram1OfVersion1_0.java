import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        // Enter your birthdate in the format: yyyy-mm-dd
        String birthdate = "1990-01-01";
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Parse the birthdate string to LocalDate
        LocalDate birthdateDate = LocalDate.parse(birthdate);
        
        // Calculate the age
        Period age = Period.between(birthdateDate, currentDate);
        
        // Print the age
        System.out.println("Your age is: " + age.getYears() + " years");
    }
}