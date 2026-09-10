import java.util.function.Predicate;

public class PrimeChecker {

    public static void main(String[] args) {
        // Create a lambda expression to check if a number is prime
        Predicate<Integer> isPrime = n -> {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // Test the lambda expression with different numbers
        System.out.println(isPrime.test(7)); // true
        System.out.println(isPrime.test(10)); // false
        System.out.println(isPrime.test(1)); // false
        System.out.println(isPrime.test(0)); // false
        System.out.println(isPrime.test(2)); // true
    }
}
