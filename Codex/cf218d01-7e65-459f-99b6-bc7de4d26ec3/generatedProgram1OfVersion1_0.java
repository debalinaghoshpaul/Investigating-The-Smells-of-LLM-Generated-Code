import java.time.LocalDate;

public class Exercise17 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Get the date before 1 year
        LocalDate dateBefore1Year = currentDate.minusYears(1);
        
        // Get the date after 1 year
        LocalDate dateAfter1Year = currentDate.plusYears(1);
        
        // Compare the dates
        if (dateBefore1Year.isBefore(currentDate)) {
            System.out.println(dateBefore1Year + " is before " + currentDate);
        } else if (dateBefore1Year.isAfter(currentDate)) {
            System.out.println(dateBefore1Year + " is after " + currentDate);
        } else {
            System.out.println(dateBefore1Year + " is the same as " + currentDate);
        }
        
        if (dateAfter1Year.isBefore(currentDate)) {
            System.out.println(dateAfter1Year + " is before " + currentDate);
        } else if (dateAfter1Year.isAfter(currentDate)) {
            System.out.println(dateAfter1Year + " is after " + currentDate);
        } else {
            System.out.println(dateAfter1Year + " is the same as " + currentDate);
        }
    }
}