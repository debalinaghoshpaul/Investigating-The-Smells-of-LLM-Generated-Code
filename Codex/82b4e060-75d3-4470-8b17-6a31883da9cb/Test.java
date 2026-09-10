import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = scanner.nextInt();

        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        int days = getNumberOfDays(month, year);
        String monthName = getMonthName(month);

        System.out.println(monthName + " " + year + " has " + days + " days");

        scanner.close();
    }

    public static int getNumberOfDays(int month, int year) {
        int days;

        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        return days;
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}
