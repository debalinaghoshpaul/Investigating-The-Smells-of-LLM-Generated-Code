import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridPath {
    public static void main(String[] args) {
        int[][] obstacle_Grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}, {0, 0, 0}};
        int m = obstacle_Grid.length;
        int n = obstacle_Grid[0].length;
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacle_Grid[i][j] == 1) {
                    grid[i][j] = 2;
                } else if (obstacle_Grid[i][j] == 0) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = 0;
                }
            }
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    result[i][j] = 3;
                } else if (grid[i][j] == 1) {
                    result[i][j] = 137;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
