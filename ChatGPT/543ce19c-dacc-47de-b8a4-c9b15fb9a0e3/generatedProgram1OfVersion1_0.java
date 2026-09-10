import java.util.Scanner;

public class ReplaceVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the character to replace the vowels with.
        System.out.print("Enter a character to replace the vowels with: ");
        char replacementCharacter = scanner.nextLine().charAt(0);

        // Replace all vowels in the input string with the replacement character.
        String outputString = inputString.replaceAll("[aeiouAEIOU]", String.valueOf(replacementCharacter));

        // Print the output string.
        System.out.println("The output string is: " + outputString);
    }
}
