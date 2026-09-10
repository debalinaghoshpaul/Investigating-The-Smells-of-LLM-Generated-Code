import java.util.Scanner;

public class SpiralArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create a 2D array to store the spiral array
        int[][] array = new int[n][n];

        // Initialize the array with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }

        // Initialize the starting row and column indices
        int row = 0;
        int col = 0;

        // Initialize the direction (0: right, 1: down, 2: left, 3: up)
        int dir = 0;

        // Initialize the count of elements to be placed in the array
        int count = 1;

        // Repeat until all the elements are placed in the array
        while (count <= n * n) {
            // Place the element in the array
            array[row][col] = count;

            // Increment the count
            count++;

            // Change the direction according to the current direction
            switch (dir) {
                case 0:
                    // If the current direction is right, check if the right cell is within the bounds of the array and is empty
                    if (col + 1 < n && array[row][col + 1] == 0) {
                        // If the right cell is within the bounds of the array and is empty, move right
                        col++;
                    } else {
                        // If the right cell is not within the bounds of the array or is not empty, change the direction to down
                        dir = 1;
                        row++;
                    }
                    break;
                case 1:
                    // If the current direction is down, check if the down cell is within the bounds of the array and is empty
                    if (row + 1 < n && array[row + 1][col] == 0) {
                        // If the down cell is within the bounds of the array and is empty, move down
                        row++;
                    } else {
                        // If the down cell is not within the bounds of the array or is not empty, change the direction to left
                        dir = 2;
                        col--;
                    }
                    break;
                case 2:
                    // If the current direction is left, check if the left cell is within the bounds of the array and is empty
                    if (col - 1 >= 0 && array[row][col - 1] == 0) {
                        // If the left cell is within the bounds of the array and is empty, move left
                        col--;
                    } else {
                        // If the left cell is not within the bounds of the array or is not empty, change the direction to up
                        dir = 3;
                        row--;
                    }
                    break;
                case 3:
                    // If the current direction is up, check if the up cell is within the bounds of the array and is empty
                    if (row - 1 >= 0 && array[row - 1][col] == 0) {
                        // If the up cell is within the bounds of the array and is empty, move up
                        row--;
                    } else {
                        // If the up cell is not within the bounds of the array or is not empty, change the direction to right
                        dir = 0;
                        col++;
                    }
                    break;
            }
        }

        // Print the spiral array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
