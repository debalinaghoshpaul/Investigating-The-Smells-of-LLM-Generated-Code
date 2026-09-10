import java.util.function.BinaryOperator;

public class LambdaConcatenateStrings {

    public static void main(String[] args) {
        // Create a lambda expression to concatenate two strings
        BinaryOperator<String> concatenate = (s1, s2) -> s1 + s2;

        // Test the lambda expression with different inputs
        String result1 = concatenate.apply("Hello", "World!");
        System.out.println(result1); // Output: HelloWorld!

        String result2 = concatenate.apply("Java", "Programming");
        System.out.println(result2); // Output: JavaProgramming

        // Test the lambda expression with empty strings
        String result3 = concatenate.apply("", "Test");
        System.out.println(result3); // Output: Test

        String result4 = concatenate.apply("Test", "");
        System.out.println(result4); // Output: Test

        // Test the lambda expression with null values
        String result5 = concatenate.apply(null, "null");
        System.out.println(result5); // Output: null

        String result6 = concatenate.apply("null", null);
        System.out.println(result6); // Output: nullnull
    }
}
