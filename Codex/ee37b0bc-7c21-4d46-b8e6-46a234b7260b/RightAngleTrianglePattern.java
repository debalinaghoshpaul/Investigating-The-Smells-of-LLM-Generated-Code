import java.util.Scanner;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Iterate over each row
        for (int i = 1; i <= rows; i++) {
            // Iterate over each column
            for (int j = 1; j <= i; j++) {
                // Print the number
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
