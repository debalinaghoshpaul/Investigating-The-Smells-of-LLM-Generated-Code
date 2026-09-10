import java.util.Scanner;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        // Create a nested loop to print the pattern
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}
