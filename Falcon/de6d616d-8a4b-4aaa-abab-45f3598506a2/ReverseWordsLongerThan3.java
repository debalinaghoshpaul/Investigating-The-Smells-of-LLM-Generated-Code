import java.util.Scanner;

public class ReverseWordsLongerThan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Split the input string into words
        String[] words = inputString.split(" ");

        // Reverse the words that are longer than 3 characters
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3) {
                words[i] = reverseString(words[i]);
            }
        }

        // Join the reversed words back into a string
        String outputString = String.join(" ", words);

        // Print the output string
        System.out.println("Output string: " + outputString);
    }

    // Reverse a given string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
