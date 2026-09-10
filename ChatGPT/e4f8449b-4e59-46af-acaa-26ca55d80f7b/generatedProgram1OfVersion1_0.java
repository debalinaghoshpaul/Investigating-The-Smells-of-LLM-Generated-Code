import java.time.Month;
import java.util.Scanner;

class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month and year from the user.
        System.out.println("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        // Get the number of days in the month.
        int daysInMonth = Month.of(month).length(year % 4 == 0);

        // Print the number of days in the month.
        System.out.println("The number of days in the month is: " + daysInMonth);
    }
}
