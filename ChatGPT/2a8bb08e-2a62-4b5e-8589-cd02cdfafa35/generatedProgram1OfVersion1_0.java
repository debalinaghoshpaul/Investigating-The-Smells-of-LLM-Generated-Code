import java.util.Scanner;

public class RemoveSpecifiedCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the character to be removed from the user
        System.out.println("Enter the character to be removed: ");
        char characterToBeRemoved = scanner.nextLine().charAt(0);

        // Create a new string without the specified character
        String newString = inputString.substring(0, 1) + inputString.substring(1, inputString.length() - 1).replace("" + characterToBeRemoved, "") + inputString.substring(inputString.length() - 1);

        // Print the new string
        System.out.println("The new string is: " + newString);
    }
}
