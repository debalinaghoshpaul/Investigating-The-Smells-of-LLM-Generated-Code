import java.util.Scanner;
import java.util.Arrays;

public class RearrangeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to a character array
        char[] charArray = inputString.toCharArray();

        // Sort the character array in ascending order
        Arrays.sort(charArray);

        // Create a new string to store the rearranged string
        StringBuilder rearrangedString = new StringBuilder();

        // Iterate over the character array
        for (int i = 0; i < charArray.length; i++) {
            // Check if the current character is the same as the previous character
            if (i > 0 && charArray[i] == charArray[i - 1]) {
                // If the current character is the same as the previous character, skip it
                continue;
            }

            // If the current character is not the same as the previous character, add it to the rearranged string
            rearrangedString.append(charArray[i]);
        }

        // Print the rearranged string
        System.out.println("The rearranged string is: " + rearrangedString.toString());
    }
}
