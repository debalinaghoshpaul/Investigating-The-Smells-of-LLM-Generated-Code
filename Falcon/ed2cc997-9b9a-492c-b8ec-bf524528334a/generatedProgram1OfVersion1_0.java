import java.util.Scanner;

public class CheckOddDigits {

    public static boolean checkOddDigits(int num) {
        // Convert the number to a string
        String numStr = Integer.toString(num);

        // Iterate over each character in the string
        for (char c : numStr.toCharArray()) {
            // Convert the character to an integer
            int digit = Character.getNumericValue(c);

            // Check if the digit is odd
            if (digit % 2 != 1) {
                return false;
            }
        }

        // If all the digits are odd, return true
        return true;
    }

    public static void main(String[] args) {
        // Get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if the number is odd
        boolean isOdd = checkOddDigits(num);

        // Print the result
        if (isOdd) {
            System.out.println("Every digit of the number is odd.");
        } else {
            System.out.println("Not every digit of the number is odd.");
        }
    }
}
