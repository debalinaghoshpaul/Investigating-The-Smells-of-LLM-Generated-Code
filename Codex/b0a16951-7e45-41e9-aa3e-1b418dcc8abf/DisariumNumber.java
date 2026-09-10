import java.util.Scanner;

public class DisariumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a Disarium number
        boolean isDisarium = isDisarium(number);

        // Print the result
        if (isDisarium) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }

    /**
     * Checks if the given number is a Disarium number.
     *
     * @param number The number to check.
     * @return True if the number is a Disarium number, false otherwise.
     */
    private static boolean isDisarium(int number) {
        int sum = 0;
        int temp = number;

        // Calculate the sum of the digits of the number powered with their respective positions
        int position = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, position);
            temp /= 10;
            position++;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}
