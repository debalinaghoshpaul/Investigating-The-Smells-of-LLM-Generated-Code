import java.util.Scanner;

public class ASCIIValueOfCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a character from the user
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Print the ASCII value
        System.out.println("The ASCII value of " + character + " is: " + asciiValue);
    }
}
