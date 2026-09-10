import java.util.function.IntUnaryOperator;

public class FactorialCalculator {
    public static void main(String[] args) {
        IntUnaryOperator factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int number = 5; // Replace with your desired number
        int factorialResult = factorial.applyAsInt(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}
