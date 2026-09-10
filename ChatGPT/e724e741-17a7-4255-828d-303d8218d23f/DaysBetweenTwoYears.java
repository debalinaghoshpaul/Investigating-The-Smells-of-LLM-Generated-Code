import java.util.Scanner;

public class DaysBetweenTwoYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the start and end years from the user
        System.out.println("Enter the start year:");
        int startYear = scanner.nextInt();

        System.out.println("Enter the end year:");
        int endYear = scanner.nextInt();

        // Calculate the number of days between the two years
        int days = 0;
        for (int year = startYear; year <= endYear; year++) {
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

            // Add the number of days in the year to the total
            if (isLeapYear) {
                days += 366;
            } else {
                days += 365;
            }
        }

        // Print the number of days between the two years
        System.out.println("The number of days between " + startYear + " and " + endYear + " is: " + days);
    }
}
