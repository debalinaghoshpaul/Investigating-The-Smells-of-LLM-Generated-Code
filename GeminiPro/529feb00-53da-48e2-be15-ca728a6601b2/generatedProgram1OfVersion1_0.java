import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Check if the year is divisible by 400
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        // Check if the year is divisible by 100 but not by 400
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        }
        // Check if the year is divisible by 4 but not by 100
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        // Otherwise, the year is not a leap year
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
