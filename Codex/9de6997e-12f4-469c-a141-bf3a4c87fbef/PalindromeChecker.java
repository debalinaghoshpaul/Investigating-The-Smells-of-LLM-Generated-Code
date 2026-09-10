import java.util.function.Predicate;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam"; // Replace with your input string

        // Lambda expression to check if a string is a palindrome
        Predicate<String> isPalindrome = (str) -> {
            StringBuilder reversed = new StringBuilder(str).reverse();
            return str.equals(reversed.toString());
        };

        // Check if the input string is a palindrome
        if (isPalindrome.test(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
