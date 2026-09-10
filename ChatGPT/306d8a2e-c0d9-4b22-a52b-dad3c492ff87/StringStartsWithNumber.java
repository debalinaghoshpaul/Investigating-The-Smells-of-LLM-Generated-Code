import java.util.Scanner;

public class StringStartsWithNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string starts with a number.
        boolean startsWithNumber = Character.isDigit(input.charAt(0));

        // Print the result.
        if (startsWithNumber) {
            System.out.println("The string starts with a number.");
        } else {
            System.out.println("The string does not start with a number.");
        }
    }
}
