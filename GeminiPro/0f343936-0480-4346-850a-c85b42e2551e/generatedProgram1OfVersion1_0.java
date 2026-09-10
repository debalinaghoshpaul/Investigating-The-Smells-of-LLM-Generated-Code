import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the number of words in the string
        int wordCount = countWords(inputString);

        // Print the result
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String inputString) {
        // Check if the input string is empty or null
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        // Split the input string into words
        String[] words = inputString.split(" ");

        // Count the number of words in the array
        return words.length;
    }
}
