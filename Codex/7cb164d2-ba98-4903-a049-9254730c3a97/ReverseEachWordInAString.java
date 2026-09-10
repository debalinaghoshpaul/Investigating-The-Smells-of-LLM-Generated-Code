import java.util.Scanner;

public class ReverseEachWordInAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(word).append(" ");
        }

        System.out.println("Reversed string: " + reversedString.toString().trim());
    }

    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        return reversedWord.toString();
    }
}
