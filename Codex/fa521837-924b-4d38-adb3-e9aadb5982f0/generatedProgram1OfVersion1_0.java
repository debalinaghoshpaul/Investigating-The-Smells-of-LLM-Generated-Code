import java.util.Scanner;

public class SumDigitNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two integers from the user.
        System.out.println("Enter the first integer:");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int secondInteger = scanner.nextInt();

        // Compute the sum of the two integers.
        int sum = firstInteger + secondInteger;

        // Convert the sum to a string.
        String sumString = Integer.toString(sum);

        // Count the number of digits in the sum.
        int digitCount = sumString.length();

        // Print the digit count to the console.
        System.out.println("The digit number of the sum of the two integers is: " + digitCount);
    }
}
