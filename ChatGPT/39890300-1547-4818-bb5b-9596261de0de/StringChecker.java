import java.util.Scanner;

public class StringChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the string is correct
        boolean isCorrect = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (!Character.isLetter(ch)) {
                isCorrect = false;
                break;
            }

            // Check if the character is in uppercase
            if (Character.isUpperCase(ch)) {
                isCorrect = false;
                break;
            }
        }

        // Print the result
        if (isCorrect) {
            System.out.println("The string is correct.");
        } else {
            System.out.println("The string is incorrect.");
        }
    }
}
