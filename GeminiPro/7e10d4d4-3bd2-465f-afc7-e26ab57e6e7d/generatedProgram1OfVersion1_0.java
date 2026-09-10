import java.util.Scanner;

public class LastIndexOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings from the user.
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Find the last index of the second string within the first string.
        int lastIndex = firstString.lastIndexOf(secondString);

        // Print the last index.
        System.out.println("The last index of the second string within the first string is: " + lastIndex);
    }
}
