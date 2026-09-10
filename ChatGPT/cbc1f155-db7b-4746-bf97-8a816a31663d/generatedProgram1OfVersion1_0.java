import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect square using a lambda expression
        boolean isPerfectSquare = Math.sqrt(number) % 1 == 0;

        // Print the result
        System.out.println(number + " is " + (isPerfectSquare ? "" : "not ") + "a perfect square.");
    }
}
