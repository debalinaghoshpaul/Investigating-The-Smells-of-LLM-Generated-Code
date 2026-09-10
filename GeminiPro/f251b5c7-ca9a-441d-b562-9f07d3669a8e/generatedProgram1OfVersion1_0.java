import java.util.Scanner;

public class MersenneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a Mersenne number
        boolean isMersenneNumber = isMersenneNumber(n);

        // Print the result
        if (isMersenneNumber) {
            System.out.println("The number is a Mersenne number.");
        } else {
            System.out.println("The number is not a Mersenne number.");
        }
    }

    /**
     * Check if a number is a Mersenne number.
     *
     * @param n The number to check.
     * @return True if the number is a Mersenne number, false otherwise.
     */
    public static boolean isMersenneNumber(int n) {
        // Check if the number is a power of 2
        if ((n & (n - 1)) != 0) {
            return false;
        }

        // Check if the number is a prime number
        if (!isPrime(n)) {
            return false;
        }

        // The number is a Mersenne number if it is a power of 2 and a prime number
        return true;
    }

    /**
     * Check if a number is a prime number.
     *
     * @param n The number to check.
     * @return True if the number is a prime number, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
