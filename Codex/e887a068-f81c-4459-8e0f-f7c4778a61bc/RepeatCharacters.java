import java.util.Scanner;

public class RepeatCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the number of characters to repeat from the user
        System.out.println("Enter the number of characters to repeat: ");
        int numChars = scanner.nextInt();

        // Get the number of times to repeat the characters from the user
        System.out.println("Enter the number of times to repeat the characters: ");
        int numTimes = scanner.nextInt();

        // Repeat the characters
        String repeatedChars = str.substring(str.length() - numChars).repeat(numTimes);

        // Print the repeated characters
        System.out.println(repeatedChars);
    }
}
