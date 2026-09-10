import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("The number must be positive.");
            return;
        }

        // Check if the number is 0
        if (number == 0) {
            System.out.println("The number 0 is not a perfect square.");
            return;
        }

        // Check if the number is 1
        if (number == 1) {
            System.out.println("The number 1 is a perfect square.");
            return;
        }

        // Check if the number is a perfect square
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt == number) {
            System.out.println("The number " + number + " is a perfect square.");
        } else {
            System.out.println("The number " + number + " is not a perfect square.");
        }
    }
}
