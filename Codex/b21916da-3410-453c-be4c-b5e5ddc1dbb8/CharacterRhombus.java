import java.util.Scanner;

public class CharacterRhombus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        // Print the upper half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print the spaces before the characters
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the characters
            for (char c = 'A'; c <= 'A' + i - 1; c++) {
                System.out.print(c);
            }

            // Print the characters in reverse order
            for (char c = (char)('A' + i - 2); c >= 'A'; c--) {
                System.out.print(c);
            }

            // Move to the next line
            System.out.println();
        }

        // Print the lower half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print the spaces before the characters
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the characters
            for (char c = 'A'; c <= 'A' + i - 1; c++) {
                System.out.print(c);
            }

            // Print the characters in reverse order
            for (char c = (char)('A' + i - 2); c >= 'A'; c--) {
                System.out.print(c);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
