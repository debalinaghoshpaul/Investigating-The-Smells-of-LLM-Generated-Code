import java.util.*;
import java.lang.*;

public class SwapRowsAndColumns {

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
