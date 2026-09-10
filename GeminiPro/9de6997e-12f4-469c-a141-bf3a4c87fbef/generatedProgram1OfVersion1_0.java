import java.util.function.Predicate;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a lambda expression to check if a string is a palindrome
        Predicate<String> isPalindrome = (str) -> {
            int i = 0;
            int j = str.length() - 1;

            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }

            return true;
        };

        // Test the lambda expression with different strings
        String[] testStrings = {"racecar", "madam", "kayak", "level", "hello", "world"};
        for (String testString : testStrings) {
            boolean isPalindromeResult = isPalindrome.test(testString);
            System.out.println(testString + " is a palindrome: " + isPalindromeResult);
        }
    }
}
