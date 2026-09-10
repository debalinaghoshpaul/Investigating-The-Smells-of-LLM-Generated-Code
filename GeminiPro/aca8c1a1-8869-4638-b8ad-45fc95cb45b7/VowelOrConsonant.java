import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Input an alphabet: ");
        String letter = input.nextLine();

        // Check if the input is a single character
        if (letter.length() != 1) {
            System.out.println("Error: Input must be a single character.");
            return;
        }

        // Check if the input is a letter
        char letterChar = letter.charAt(0);
        if (!Character.isLetter(letterChar)) {
            System.out.println("Error: Input must be a letter.");
            return;
        }

        // Check if the input is a vowel or consonant
        if (isVowel(letterChar)) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }

    // Check if the given character is a vowel
    private static boolean isVowel(char letter) {
        return "aeiouAEIOU".indexOf(letter) != -1;
    }
}
