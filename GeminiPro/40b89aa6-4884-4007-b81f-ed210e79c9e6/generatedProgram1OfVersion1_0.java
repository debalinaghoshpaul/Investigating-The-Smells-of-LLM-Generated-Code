import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the user's birth year, month, and day
        System.out.println("Enter your birth year:");
        int birthYear = input.nextInt();

        System.out.println("Enter your birth month (1-12):");
        int birthMonth = input.nextInt();

        System.out.println("Enter your birth day:");
        int birthDay = input.nextInt();

        // Get the current year, month, and day
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1; // January is 0
        int currentDay = now.get(Calendar.DAY_OF_MONTH);

        // Calculate the user's age
        int age = currentYear - birthYear;

        // Adjust the age if the user's birthday has not yet passed this year
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        // Print the user's age
        System.out.println("Your age is " + age);
    }
}
