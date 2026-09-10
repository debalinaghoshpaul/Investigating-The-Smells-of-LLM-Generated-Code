import java.util.Calendar;

public class YearInfo {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        // Print the current year
        System.out.println("Current Year: " + currentYear);
    }
}