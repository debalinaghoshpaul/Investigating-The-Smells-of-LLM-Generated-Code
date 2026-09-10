import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int m = scanner.nextInt();

        // Create a two-dimensional array
        boolean[][] A = new boolean[m][m];

        // Initialize the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                // Check if i and j are prime
                if (isPrime(i) && isPrime(j)) {
                    A[i][j] = false;
                } else {
                    A[i][j] = true;
                }
            }
        }

        // Print the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
