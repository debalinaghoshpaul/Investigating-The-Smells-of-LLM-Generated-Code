import java.time.DayOfWeek;
import java.time.LocalDate;

public class FirstAndLastDayOfEachWeek {

  public static void main(String[] args) {
    // Get the current date
    LocalDate today = LocalDate.now();

    // Get the first day of the week
    LocalDate firstDayOfWeek = today.with(DayOfWeek.MONDAY);

    // Get the last day of the week
    LocalDate lastDayOfWeek = today.with(DayOfWeek.SUNDAY);

    // Print the first and last day of the week
    System.out.println("First day of the week: " + firstDayOfWeek);
    System.out.println("Last day of the week: " + lastDayOfWeek);
  }
}
