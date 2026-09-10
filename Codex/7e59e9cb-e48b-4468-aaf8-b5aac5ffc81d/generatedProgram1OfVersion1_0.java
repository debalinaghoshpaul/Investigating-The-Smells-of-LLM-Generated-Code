import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int number = 123456789;
        int largestPrimeFactor = findLargestPrimeFactor(number);
        System.out.println("Largest prime factor of " + number + " is: " + largestPrimeFactor);
    }

    public static int findLargestPrimeFactor(int number) {
        IntPredicate isPrime = n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
        return IntStream.rangeClosed(2, number)
                .filter(n -> number % n == 0 && isPrime.test(n))
                .max()
                .orElse(-1);
    }
}