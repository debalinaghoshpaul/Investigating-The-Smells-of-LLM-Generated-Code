import java.util.Scanner;

public class WordExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input sentence
        String sentence = scanner.nextLine();

        // Extract words of length 3 to 6 characters
        String[] words = sentence.split("[\\s\\p{Punct}]+");
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}
