import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the order of the magic square from the user
        System.out.print("Enter the order of the magic square: ");
        int n = input.nextInt();

        // Check if the order is valid
        if (n <= 0) {
            System.out.println("Invalid order: " + n);
            return;
        }

        // Create a 2D array to represent the magic square
        int[][] square = new int[n][n];

        // Initialize the magic square with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = 0;
            }
        }

        // Generate the magic square
        generateMagicSquare(square, n);

        // Print the magic square
        System.out.println("Magic square of order " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void generateMagicSquare(int[][] square, int n) {
        // Set the starting row and column to the middle of the square
        int row = n / 2;
        int col = n / 2;

        // Place the number 1 in the middle of the square
        square[row][col] = 1;

        // Iterate over the remaining numbers from 2 to n^2
        for (int number = 2; number <= n * n; number++) {
            // Move to the next row and column
            row--;
            col++;

            // If the row or column is out of bounds, wrap around to the other side of the square
            if (row < 0) {
                row += n;
            } else if (row >= n) {
                row -= n;
            }
            if (col < 0) {
                col += n;
            } else if (col >= n) {
                col -= n;
            }

            // If the cell is already occupied, move to the next row and column
            if (square[row][col] != 0) {
                row += 2;
                col--;
                if (row < 0) {
                    row += n;
                } else if (row >= n) {
                    row -= n;
                }
                if (col < 0) {
                    col += n;
                } else if (col >= n) {
                    col -= n;
                }
            }

            // Place the number in the cell
            square[row][col] = number;
        }
    }
}
