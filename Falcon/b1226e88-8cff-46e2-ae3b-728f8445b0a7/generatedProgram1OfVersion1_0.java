import java.util.*;

public class FindElementInArrayAndMatrix {

    public static void main(String[] args) {
        // Test cases for finding element in an array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementToFind = 5;
        int result = findElementInArray(arr, elementToFind);
        System.out.println("Element found at index: " + result);

        // Test cases for finding element in a matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int elementToFindInMatrix = 5;
        boolean found = findElementInMatrix(matrix, elementToFindInMatrix);
        System.out.println("Element found in matrix: " + found);
    }

    public static int findElementInArray(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    public static boolean findElementInMatrix(int[][] matrix, int elementToFind) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == elementToFind) {
                    return true;
                }
            }
        }
        return false;
    }
}
