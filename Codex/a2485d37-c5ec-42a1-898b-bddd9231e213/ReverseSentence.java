import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        // Reverse the sentence
        String[] words = input.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        // Remove trailing space
        reversedSentence = reversedSentence.substring(0, reversedSentence.length() - 1);

        // Print the reversed sentence
        System.out.println("Result: " + reversedSentence);
    }
}
