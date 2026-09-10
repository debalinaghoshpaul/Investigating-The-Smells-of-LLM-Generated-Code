import java.util.Scanner;

public class AddDashVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Add a dash before and after every vowel in the string
        String outputString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (isVowel(currentChar)) {
                outputString += "-" + currentChar + "-";
            } else {
                outputString += currentChar;
            }
        }

        // Print the output string
        System.out.println("The output string is: " + outputString);
    }

    /**
     * Checks if a given character is a vowel.
     *
     * @param character The character to check.
     * @return True if the character is a vowel, false otherwise.
     */
    private static boolean isVowel(char character) {
        return "AEIOUaeiou".indexOf(character) != -1;
    }
}
