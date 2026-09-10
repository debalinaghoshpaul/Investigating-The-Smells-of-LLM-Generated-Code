import java.util.function.Predicate;

public class EmptyStringChecker {
    public static void main(String[] args) {
        String input = ""; // Replace this with your input string

        Predicate<String> isEmpty = str -> str.isEmpty();

        if (isEmpty.test(input)) {
            System.out.println("The string is empty");
        } else {
            System.out.println("The string is not empty");
        }
    }
}
