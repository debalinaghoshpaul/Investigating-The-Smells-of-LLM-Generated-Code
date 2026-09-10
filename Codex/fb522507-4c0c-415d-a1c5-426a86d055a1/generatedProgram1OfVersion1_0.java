import java.util.function.IntPredicate;

public class PrimeChecker {
    public static void main(String[] args) {
        IntPredicate isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // Test the lambda expression
        int number = 17;
        if (isPrime.test(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}