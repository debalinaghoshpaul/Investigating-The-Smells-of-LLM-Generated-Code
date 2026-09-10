import java.util.Arrays;

public class UniquePaths {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Initialize a 2D array to store the number of unique paths from each cell to the bottom-right corner
        int[][] dp = new int[m][n];

        // If the top-left cell is an obstacle, then there are no unique paths from that cell
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Initialize the first row and first column of the dp array
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 1;
            } else {
                break;
            }
        }

        // Fill in the remaining cells of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        // Return the number of unique paths from the top-left cell to the bottom-right corner
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        System.out.println(uniquePathsWithObstacles(obstacleGrid)); // Output: 2

        int[][] obstacleGrid2 = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 0}
        };

        System.out.println(uniquePathsWithObstacles(obstacleGrid2)); // Output: 0
    }
}
