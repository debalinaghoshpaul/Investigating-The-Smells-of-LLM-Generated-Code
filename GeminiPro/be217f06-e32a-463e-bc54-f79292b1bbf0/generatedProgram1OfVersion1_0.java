import java.util.Scanner;

public class RemoveSpecificLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Remove the specific letters from the input string.
        String updatedString = inputString.replaceAll("[pqr]", "");

        // Print the updated string.
        System.out.println("Updated string: " + updatedString);
        scanner.close();
    }
}
