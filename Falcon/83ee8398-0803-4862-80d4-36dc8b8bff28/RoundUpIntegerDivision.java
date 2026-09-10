import java.util.Scanner;

public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dividend and divisor from the user.
        System.out.println("Enter the dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = scanner.nextInt();

        // Round up the result of the integer division.
        int result = (int) Math.ceil((double) dividend / divisor);

        // Print the result.
        System.out.println("The rounded up result of the integer division is: " + result);
    }
}
