import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the number of rows (half of the diamond)
    System.out.println("Enter number of rows (half of the diamond) : ");
    int rows = scanner.nextInt();

    // Generate the diamond pattern
    for (int i = 1; i <= rows; i++) {
      // Print spaces before the stars
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }

      // Print stars
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }

      // Move to the next line
      System.out.println();
    }

    // Generate the bottom half of the diamond
    for (int i = rows - 1; i >= 1; i--) {
      // Print spaces before the stars
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }

      // Print stars
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }

      // Move to the next line
      System.out.println();
    }
  }
}
