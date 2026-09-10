import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormats {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format 1: dd-MM-yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate1 = currentDate.format(format1);
        System.out.println("Format 1: " + formattedDate1);

        // Format 2: MM/dd/yyyy
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate2 = currentDate.format(format2);
        System.out.println("Format 2: " + formattedDate2);

        // Format 3: yyyy-MM-dd
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate3 = currentDate.format(format3);
        System.out.println("Format 3: " + formattedDate3);
    }
}