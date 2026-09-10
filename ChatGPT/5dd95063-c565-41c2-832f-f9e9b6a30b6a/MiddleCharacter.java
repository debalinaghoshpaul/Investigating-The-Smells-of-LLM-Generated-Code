import java.util.Scanner;

public class MiddleCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        System.out.println("Input a string:");
        String input = scanner.nextLine();

        // Find the length of the string
        int length = input.length();

        // Check if the length of the string is odd or even
        if (length % 2 == 0) {
            // If the length is even, there will be one middle character
            int middleIndex = length / 2 - 1;
            char middleCharacter = input.charAt(middleIndex);

            // Print the middle character
            System.out.println("The middle character in the string: " + middleCharacter);
        } else {
            // If the length is odd, there will be two middle characters
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            char middleCharacter1 = input.charAt(middleIndex1);
            char middleCharacter2 = input.charAt(middleIndex2);

            // Print the two middle characters
            System.out.println("The middle characters in the string: " + middleCharacter1 + middleCharacter2);
        }
    }
}
