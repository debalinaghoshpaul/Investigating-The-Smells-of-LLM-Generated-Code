import java.util.Scanner;

public class RightAngleTriangleWithNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Iterate over the rows
        for (int i = 1; i <= n; i++) {
            // Iterate over the columns
            for (int j = 1; j <= i; j++) {
                // Print the number
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
