import java.util.function.Predicate;

public class EmptyStringCheck {

    public static void main(String[] args) {
        // Create a lambda expression to check if a string is empty
        Predicate<String> isEmpty = String::isEmpty;

        // Test the lambda expression with different strings
        System.out.println(isEmpty.test("")); // true
        System.out.println(isEmpty.test("Hello")); // false
        System.out.println(isEmpty.test(null)); // false

        // Test corner cases
        System.out.println(isEmpty.test(" ")); // false
        System.out.println(isEmpty.test("\t")); // false
        System.out.println(isEmpty.test("\n")); // false
    }
}
