import java.util.Scanner;

public class CreateStringFirstThreeChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String str1 = scanner.nextLine();

        // Create a new string with the first three characters of the input string
        String newStr = str1.substring(0, Math.min(3, str1.length()));

        // Pad the new string with '#' characters if necessary
        newStr = newStr.padEnd(3, '#');

        // Print the new string
        System.out.println("The new string is: " + newStr);
    }
}
