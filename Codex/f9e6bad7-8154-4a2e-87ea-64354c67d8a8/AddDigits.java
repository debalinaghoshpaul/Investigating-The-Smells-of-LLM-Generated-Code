import java.util.Scanner;

public class AddDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input number: ");
    int n = input.nextInt();

    // Calculate the sum of n, nn, and nnn
    int sum = n + (n * 10) + (n * 100);

    // Print the result
    System.out.println(n + " + " + (n * 10) + "  + " + (n * 100) + "\n" + sum);
  }
}
