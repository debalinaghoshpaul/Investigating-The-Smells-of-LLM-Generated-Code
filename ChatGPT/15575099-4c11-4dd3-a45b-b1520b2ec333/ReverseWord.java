import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input word from the user
        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        // Reverse the word
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // Print the reversed word
        System.out.println("Reverse word: " + reversedWord);
    }
}
