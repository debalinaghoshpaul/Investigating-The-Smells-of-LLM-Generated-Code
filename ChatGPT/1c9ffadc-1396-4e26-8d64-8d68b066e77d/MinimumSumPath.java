import java.util.Arrays;

class MinimumSumPath {

    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}
        };

        // Find the minimum sum path
        int minSum = findMinSumPath(matrix);

        // Print the result
        System.out.println("Sum of all numbers along its path: " + minSum);
    }

    public static int findMinSumPath(int[][] matrix) {
        // Initialize the dp array
        int[][] dp = new int[matrix.length][matrix[0].length];

        // Initialize the first row and first column of the dp array
        dp[0][0] = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        }
        for (int j = 1; j < matrix[0].length; j++) {
            dp[0][j] = dp[0][j - 1] + matrix[0][j];
        }

        // Fill the rest of the dp array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }

        // Return the minimum sum
        return dp[matrix.length - 1][matrix[0].length - 1];
    }
}
