import java.util.Scanner;

public class LastWordLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Find the length of the last word
        int lastWordLength = 0;
        boolean inWord = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.isLetter(input.charAt(i))) {
                if (!inWord) {
                    lastWordLength = 1;
                    inWord = true;
                } else {
                    lastWordLength++;
                }
            } else {
                inWord = false;
            }
        }

        // Print the length of the last word
        System.out.println("Length of the last word: " + lastWordLength);
    }
}
