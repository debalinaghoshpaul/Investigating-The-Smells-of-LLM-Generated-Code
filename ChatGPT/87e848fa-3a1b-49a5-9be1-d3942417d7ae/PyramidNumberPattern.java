import java.util.Scanner;

public class PyramidNumberPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Create a nested loop to print the pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces for the current row
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print the numbers for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
