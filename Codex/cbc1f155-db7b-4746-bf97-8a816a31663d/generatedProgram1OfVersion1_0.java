import java.util.function.Predicate;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        int number = 16; // Replace with your desired number

        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        if (isPerfectSquare.test(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}