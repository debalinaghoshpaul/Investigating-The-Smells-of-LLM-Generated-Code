import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int rows = arr.length;
        int columns = arr[0].length;
        int[][] newArr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After changing the rows and columns of the said array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

