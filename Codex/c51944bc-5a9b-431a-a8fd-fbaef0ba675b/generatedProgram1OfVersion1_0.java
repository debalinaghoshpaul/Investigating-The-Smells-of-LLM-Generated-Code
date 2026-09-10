import java.util.Scanner;

public class SwapTwoVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two variables from the user.
        System.out.println("Enter the first variable:");
        int firstVariable = scanner.nextInt();

        System.out.println("Enter the second variable:");
        int secondVariable = scanner.nextInt();

        // Swap the two variables using a temporary variable
        int temp = firstVariable;
        firstVariable= secondVariable;
        secondVariable= temp;

        // Print the swapped values.
        System.out.println("The first variable is now: " + firstVariable);
        System.out.println("The second variable is now: " + secondVariable);
    }
}
