import java.util.Scanner;

public class NextSmallestPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int nextPalindrome = findNextPalindrome(number);

        System.out.println("The next smallest palindrome is: " + nextPalindrome);
    }

    public static int findNextPalindrome(int number) {
        int nextPalindrome = number + 1;

        while (!isPalindrome(nextPalindrome)) {
            nextPalindrome++;
        }

        return nextPalindrome;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
