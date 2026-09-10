import java.util.Scanner;

public class RemoveSpecifiedCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Read the characters to be removed
        System.out.println("Enter the characters to be removed: ");
        String charactersToRemove = scanner.nextLine();

        // Remove the specified characters and their immediate left and right adjacent characters
        String result = removeCharacters(inputString, charactersToRemove);

        // Print the result
        System.out.println("The resulting string is: " + result);
    }

    public static String removeCharacters(String inputString, String charactersToRemove) {
        // Create a new string to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the input string
        for (int i = 0; i < inputString.length(); i++) {
            // Get the current character
            char currentChar = inputString.charAt(i);

            // Check if the current character is one of the characters to be removed
            if (charactersToRemove.indexOf(currentChar) == -1) {
                // If the current character is not one of the characters to be removed, append it to the result
                result.append(currentChar);
            } else {
                // If the current character is one of the characters to be removed, skip the next character as well
                i++;
            }
        }

        // Return the result
        return result.toString();
    }
}
