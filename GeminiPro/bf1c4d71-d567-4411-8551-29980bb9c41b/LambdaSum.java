import java.util.function.BinaryOperator;

public class LambdaSum {

    public static void main(String[] args) {
        // Create a lambda expression to find the sum of two integers
        BinaryOperator<Integer> sumLambda = (a, b) -> a + b;

        // Test the lambda expression with different test cases
        System.out.println(sumLambda.apply(1, 2)); // 3
        System.out.println(sumLambda.apply(0, 0)); // 0
        System.out.println(sumLambda.apply(1, -1)); // 0
        System.out.println(sumLambda.apply(Integer.MAX_VALUE, Integer.MAX_VALUE)); // Overflow error
        System.out.println(sumLambda.apply(Integer.MIN_VALUE, Integer.MIN_VALUE)); // Overflow error
    }
}
