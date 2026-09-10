import java.util.Arrays;

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int target = 30;

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Target found in matrix");
        } else {
            System.out.println("Target not found in matrix");
        }
    }
}
