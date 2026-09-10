import java.util.Scanner;

public class CheckIfStringContainsAnotherString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the first string contains the second string.
        boolean contains = firstString.contains(secondString);

        // Print the result.
        System.out.println(contains);
    }
}
