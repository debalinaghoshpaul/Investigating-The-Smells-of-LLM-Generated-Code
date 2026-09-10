import java.util.Scanner;

public class CountWordsEndingInMN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input text from the user
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        // Initialize the count of words ending in 'm' or 'n'
        int count = 0;

        // Convert the text to lowercase for case-insensitive comparison
        text = text.toLowerCase();

        // Split the text into words
        String[] words = text.split(" ");

        // Iterate over the words and count the words ending in 'm' or 'n'
        for (String word : words) {
            if (word.endsWith("m") || word.endsWith("n")) {
                count++;
            }
        }

        // Print the count of words ending in 'm' or 'n'
        System.out.println("The number of words ending in 'm' or 'n' is: " + count);
    }
}
