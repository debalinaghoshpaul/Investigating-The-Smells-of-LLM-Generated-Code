import java.util.Scanner;

public class MemoryMatchingGame {

    private static int[][] cards = new int[4][4];
    private static boolean[][] faceUp = new boolean[4][4];

    public static void main(String[] args) {
        initializeCards();
        shuffleCards();

        Scanner scanner = new Scanner(System.in);

        while (!isGameOver()) {
            displayBoard();

            System.out.println("Enter the coordinates of the first card (row column):");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();

            System.out.println("Enter the coordinates of the second card (row column):");
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            if (cards[row1][col1] == cards[row2][col2]) {
                faceUp[row1][col1] = true;
                faceUp[row2][col2] = true;
            }

            clearScreen();
        }

        System.out.println("Congratulations! You have matched all the cards!");
    }

    private static void initializeCards() {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                cards[i][j] = value;
                value = (value % 8) + 1;
            }
        }
    }

    private static void shuffleCards() {
        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            int row1 = random.nextInt(4);
            int col1 = random.nextInt(4);
            int row2 = random.nextInt(4);
            int col2 = random.nextInt(4);

            int temp = cards[row1][col1];
            cards[row1][col1] = cards[row2][col2];
            cards[row2][col2] = temp;
        }
    }

    private static boolean isGameOver() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!faceUp[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (faceUp[i][j]) {
                    System.out.print(cards[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
