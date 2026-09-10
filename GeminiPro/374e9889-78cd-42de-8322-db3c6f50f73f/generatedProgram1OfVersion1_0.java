import java.util.Scanner;

public class MoveLowerCaseToFront {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        // Create two strings: one to store the lowercase letters and one to store the uppercase letters
        String lowercaseLetters = "";
        String uppercaseLetters = "";

        // Iterate through the word and add each letter to the appropriate string
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLowerCase(letter)) {
                lowercaseLetters += letter;
            } else {
                uppercaseLetters += letter;
            }
        }

        // Concatenate the lowercase and uppercase letters to get the final word
        String finalWord = lowercaseLetters + uppercaseLetters;

        // Print the final word
        System.out.println("The final word is: " + finalWord);
    }
}
