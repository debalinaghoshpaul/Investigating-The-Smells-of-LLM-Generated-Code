public class ChangeRowsColumns {
    public static void main(String[] args) {
        int[][] originalArray = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int rows = originalArray.length;
        int columns = originalArray[0].length;

        int[][] newArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nAfter changing the rows and columns of the said array:");
        printArray(newArray);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
