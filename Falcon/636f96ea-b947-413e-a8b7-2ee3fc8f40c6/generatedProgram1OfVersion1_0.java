import java.util.Scanner;

public class LargeIntegerAddition {

    // The maximum number of digits that can be stored in an array.
    private static final int MAX_DIGITS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two integers from the user.
        System.out.print("Enter the first integer: ");
        String firstInteger = scanner.nextLine();

        System.out.print("Enter the second integer: ");
        String secondInteger = scanner.nextLine();

        // Check if the integers are valid.
        if (!isValidInteger(firstInteger) || !isValidInteger(secondInteger)) {
            System.out.println("Invalid integer.");
            return;
        }

        // Convert the integers to arrays of digits.
        int[] firstIntegerDigits = toDigits(firstInteger);
        int[] secondIntegerDigits = toDigits(secondInteger);

        // Reverse the order of the digits in the arrays.
        reverse(firstIntegerDigits);
        reverse(secondIntegerDigits);

        // Add the two integers.
        int[] result = add(firstIntegerDigits, secondIntegerDigits);

        // Check if the result is an integer overflow.
        if (result.length > MAX_DIGITS) {
            System.out.println("Integer overflow.");
            return;
        }

        // Print the result.
        System.out.println("The sum of the two integers is: " + toString(result));
    }

    /**
     * Checks if the given string is a valid integer.
     *
     * @param integer The string to check.
     * @return True if the string is a valid integer, false otherwise.
     */
    private static boolean isValidInteger(String integer) {
        for (int i = 0; i < integer.length(); i++) {
            if (!Character.isDigit(integer.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Converts the given string to an array of digits.
     *
     * @param integer The string to convert.
     * @return An array of digits.
     */
    private static int[] toDigits(String integer) {
        int[] digits = new int[integer.length()];

        for (int i = 0; i < integer.length(); i++) {
            digits[i] = Character.getNumericValue(integer.charAt(i));
        }

        return digits;
    }

    /**
     * Reverses the order of the elements in the given array.
     *
     * @param array The array to reverse.
     */
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    /**
     * Adds the two given arrays of digits.
     *
     * @param firstIntegerDigits  The first array of digits.
     * @param secondIntegerDigits The second array of digits.
     * @return An array of digits representing the sum of the two given arrays.
     */
    private static int[] add(int[] firstIntegerDigits, int[] secondIntegerDigits) {
        int[] result = new int[Math.max(firstIntegerDigits.length, secondIntegerDigits.length) + 1];

        int carry = 0;

        for (int i = 0; i < result.length; i++) {
            int firstDigit = i < firstIntegerDigits.length ? firstIntegerDigits[i] : 0;
            int secondDigit = i < secondIntegerDigits.length ? secondIntegerDigits[i] : 0;

            int sum = firstDigit + secondDigit + carry;

            result[i] = sum % 10;
            carry = sum / 10;
        }

        return result;
    }

    /**
     * Converts the given array of digits to a string.
     *
     * @param digits The array of digits to convert.
     * @return A string representing the given array of digits.
     */
    private static String toString(int[] digits) {
        StringBuilder builder = new StringBuilder();

        for (int digit : digits) {
            builder.append(digit);
        }

        return builder.toString();
    }
}
