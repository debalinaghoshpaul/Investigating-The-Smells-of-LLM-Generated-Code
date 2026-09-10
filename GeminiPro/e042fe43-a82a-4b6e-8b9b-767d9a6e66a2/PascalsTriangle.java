import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Create a 2D array to store the Pascal's triangle
        int[][] triangle = new int[numRows][numRows];

        // Iterate over the rows
        for (int i = 0; i < numRows; i++) {
            // Iterate over the columns
            for (int j = 0; j <= i; j++) {
                // If the current cell is the first or last cell in the row, then the value is 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                }
                // Otherwise, the value is the sum of the values in the two cells above it
                else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // Print the Pascal's triangle
        for (int i = 0; i < numRows; i++) {
            // Print the spaces before the row
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the values in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
