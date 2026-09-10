import java.util.Scanner;

public class LastThreeCharsRepeat4Times {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original string from the user
        System.out.println("Enter a string of length 3 or more: ");
        String originalString = scanner.nextLine();

        // Check if the string is of length 3 or more
        if (originalString.length() < 3) {
            System.out.println("Invalid input. The string must be of length 3 or more.");
            return;
        }

        // Get the last 3 characters of the original string
        String lastThreeChars = originalString.substring(originalString.length() - 3);

        // Repeat the last 3 characters 4 times
        String repeatedString = lastThreeChars.repeat(4);

        // Print the repeated string
        System.out.println("The new string is: " + repeatedString);
    }
}
