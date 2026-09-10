import java.util.*;

public class Maze {

    public static void main(String[] args) {
        // Create a 10x10 grid of stars
        char[][] grid = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = '*';
            }
        }

        // Generate a random starting position for the user
        Random rand = new Random();
        int row = rand.nextInt(10);
        int col = rand.nextInt(10);

        // Place the user at the starting position
        grid[row][col] = 'N';

        // Get the user's input for movement
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (left, right, up, down): ");
            String move = scanner.nextLine();

            // Update the user's position based on the input
            switch (move) {
                case "left":
                    if (col > 0) {
                        grid[row][col] = '$';
                        col--;
                        grid[row][col] = 'N';
                    }
                    break;
                case "right":
                    if (col < 9) {
                        grid[row][col] = '$';
                        col++;
                        grid[row][col] = 'N';
                    }
                    break;
                case "up":
                    if (row > 0) {
                        grid[row][col] = '$';
                        row--;
                        grid[row][col] = 'N';
                    }
                    break;
                case "down":
                    if (row < 9) {
                        grid[row][col] = '$';
                        row++;
                        grid[row][col] = 'N';
                    }
                    break;
            }

            // Print the updated grid
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
}
