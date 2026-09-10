import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberSum {

    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        // Calculate the sum of all prime numbers in the given range using a lambda expression
        int sum = IntStream.range(start, end + 1)
                .filter(n -> isPrime(n))
                .sum();

        System.out.println("The sum of all prime numbers in the range [" + start + ", " + end + "] is: " + sum);
    }

    // Check if the given number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
