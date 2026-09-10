import java.util.Random;

public class SimpleGameSimulation {
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        int currentRow;
        int currentCol;

        // Initialize grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '*';
            }
        }

        // Generate random starting position
        Random rand = new Random();
        currentRow = rand.nextInt(3);
        currentCol = rand.nextInt(3);
        grid[currentRow][currentCol] = 'N';

        // Display initial grid
        printGrid(grid);

        // Game loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your move (left, right, up, down): ");
            String move = scanner.nextLine();

            // Update current position based on user input
            if (move.equals("left")) {
                currentCol = Math.max(0, currentCol - 1);
            } else if (move.equals("right")) {
                currentCol = Math.min(2, currentCol + 1);
            } else if (move.equals("up")) {
                currentRow = Math.max(0, currentRow - 1);
            } else if (move.equals("down")) {
                currentRow = Math.min(2, currentRow + 1);
            }

            // Update grid with new player position
            grid[currentRow][currentCol] = 'N';
            grid[currentRow][currentCol] = 'N';

            // Display updated grid
            printGrid(grid);

            // Check if the game is won
            if (currentRow == 0 && currentCol == 2) {
                System.out.println("Congratulations! You reached the end of the game.");
                break;
            }
        }
    }

    public static void printGrid(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}