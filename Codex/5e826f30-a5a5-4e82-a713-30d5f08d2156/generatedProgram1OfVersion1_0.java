import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int[][] data = new int[100][100];
        int n = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            for (int i = 0; i < parts.length; i++) {
                data[n][i] = Integer.parseInt(parts[i]);
            }
            n++;
        }

        // Find the maximum sum
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    sum += data[i][j];
                }
            }
            maxSum = Math.max(maxSum, sum);
        }

        // Print the maximum sum
        System.out.println(maxSum);
    }
}
