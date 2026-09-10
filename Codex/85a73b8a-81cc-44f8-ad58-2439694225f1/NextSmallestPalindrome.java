import java.util.Scanner;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int nextPalindrome = findNextPalindrome(number);
        System.out.println("Next smallest palindrome: " + nextPalindrome);
    }

    public static int findNextPalindrome(int number) {
        while (true) {
            number++;
            if (isPalindrome(number)) {
                return number;
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
