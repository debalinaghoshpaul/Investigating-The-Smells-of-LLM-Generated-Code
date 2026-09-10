import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of coins
        int n = sc.nextInt();

        // Get the number of coins in each row
        int k = sc.nextInt();

        // Create a 2D array to store the coins
        int[][] coins = new int[n][k];

        // Fill the array with coins
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                coins[i][j] = 1;
            }
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(coins[i][j]);
            }
            System.out.println();
        }
    }
}
