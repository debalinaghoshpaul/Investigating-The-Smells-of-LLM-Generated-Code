public class Main {
    public static void main(String[] args) {
        // Define the lambda expression
        SumFunction sum = (a, b) -> a + b;

        // Test the lambda expression
        int result = sum.calculate(5, 3);
        System.out.println("Sum: " + result);
    }

    // Functional interface for the lambda expression
    interface SumFunction {
        int calculate(int a, int b);
    }
}