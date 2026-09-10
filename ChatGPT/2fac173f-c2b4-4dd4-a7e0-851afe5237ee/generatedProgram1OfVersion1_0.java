import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int[][] spiralArray = generateSpiralArray(n);

        // Print the spiral array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiralArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralArray(int n) {
        int[][] spiralArray = new int[n][n];
        int value = 1;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (value <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                spiralArray[rowStart][i] = value++;
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                spiralArray[i][colEnd] = value++;
            }
            for (int i = colEnd - 1; i >= colStart; i--) {
                spiralArray[rowEnd][i] = value++;
            }
            for (int i = rowEnd - 1; i > rowStart; i--) {
                spiralArray[i][colStart] = value++;
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }

        return spiralArray;
    }
}
