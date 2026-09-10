import java.util.Scanner;

public class TriangleOfAts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Generate the triangle of @'s
        for (int i = 0; i < n; i++) {
            // Print the spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print the @'s
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
