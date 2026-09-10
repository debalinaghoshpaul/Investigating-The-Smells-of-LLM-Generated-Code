import java.util.Arrays;

public class MagicSquareGenerator {
    public static void main(String[] args) {
        int n = 3; // Change this value to generate magic square of different order

        int[][] magicSquare = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            magicSquare[row][col] = num;
            num++;
            row--;
            col++;

            if (row < 0 && col == n) {
                row += 2;
                col--;
            } else if (row < 0) {
                row = n - 1;
            } else if (col == n) {
                col = 0;
            } else if (magicSquare[row][col] != 0) {
                row += 2;
                col--;
            }
        }

        // Print the magic square
        for (int[] rowArr : magicSquare) {
            System.out.println(Arrays.toString(rowArr));
        }
    }
}
