import java.util.Scanner;

public class ModularExponentiation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        System.out.print("Enter the base x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the modulus y: ");
        int y = scanner.nextInt();

        // Compute xn % y using the modular exponentiation algorithm
        int result = modPow(x, n, y);

        // Print the result
        System.out.println("The result is: " + result);
    }

    private static int modPow(int x, int n, int y) {
        // Base case: n == 0
        if (n == 0) {
            return 1;
        }

        // Recursive case: n is odd
        if (n % 2 == 1) {
            return (modPow(x, n - 1, y) * x) % y;
        }

        // Recursive case: n is even
        else {
            int z = modPow(x, n / 2, y);
            return (z * z) % y;
        }
    }
}
