import java.util.Arrays;
import java.util.Scanner;

public class PenultimateWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String:");
        String input = scanner.nextLine();

        // Split the input into an array of words
        String[] words = input.split(" ");

        // Check if the input is valid
        if (words.length <= 1) {
            System.out.println("Input must contain more than one word.");
        } else {
            // Get the penultimate word
            String penultimateWord = words[words.length - 2];

            // Print the penultimate word
            System.out.println("Penultimate word: " + penultimateWord);
        }
    }
}
