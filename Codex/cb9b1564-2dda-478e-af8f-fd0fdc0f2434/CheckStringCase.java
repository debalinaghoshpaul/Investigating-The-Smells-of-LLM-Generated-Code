import java.util.Arrays;
import java.util.List;

public class CheckStringCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("HELLO", "world", "Java", "PROGRAMMING");

        boolean allUppercase = strings.stream().allMatch(s -> s.equals(s.toUpperCase()));
        boolean allLowercase = strings.stream().allMatch(s -> s.equals(s.toLowerCase()));

        if (allUppercase) {
            System.out.println("All strings are in uppercase.");
        } else if (allLowercase) {
            System.out.println("All strings are in lowercase.");
        } else {
            System.out.println("Strings are in mixed case.");
        }
    }
}
