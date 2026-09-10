import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is palindrome or not
        boolean isPalindrome = isPalindrome(number);

        // Print the result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        // Convert the number to string
        String numberString = String.valueOf(number);

        // Reverse the string
        String reversedString = new StringBuilder(numberString).reverse().toString();

        // Check if the original string and the reversed string are equal
        return numberString.equals(reversedString);
    }
}
