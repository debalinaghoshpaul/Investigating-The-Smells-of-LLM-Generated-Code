import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number(string): ");
        String number = input.nextLine();

        // Try to convert the string to an integer.
        int integerValue;
        try {
            integerValue = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number.");
            return;
        }

        // Print the integer value.
        System.out.println("The integer value is: " + integerValue);
    }
}
