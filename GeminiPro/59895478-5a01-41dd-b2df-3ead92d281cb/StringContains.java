import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user.
        System.out.println("Input first string:");
        String firstString = scanner.nextLine();

        // Get the second string from the user.
        System.out.println("Input second string:");
        String secondString = scanner.nextLine();

        // Check if the second string contains the first one.
        boolean contains = secondString.contains(firstString);

        // Print the result.
        System.out.println("If the second string contains the first one? " + contains);
    }
}
