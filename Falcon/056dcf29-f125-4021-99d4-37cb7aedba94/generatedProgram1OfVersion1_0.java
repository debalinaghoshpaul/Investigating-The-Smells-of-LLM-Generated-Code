import java.util.Scanner;

public class MonthsLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year2 = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month2 = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day2 = scanner.nextInt();
        System.out.println("The number of months left in the year is: " + (year - year2) + ".");
        System.out.println("The number of months left in the year is: " + (month - month2) + ".");
        System.out.println("The number of months left in the year is: " + (day - day2) + ".");
    }
}

// 