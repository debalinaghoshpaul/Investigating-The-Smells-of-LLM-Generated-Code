import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();

        // Check if the number is a lucky number
        boolean isLucky = isLucky(number);

        // Print the result
        System.out.println("Is Lucky number? " + isLucky);
    }

    /**
     * Checks if a number is a lucky number.
     *
     * @param number The number to check.
     * @return True if the number is a lucky number, false otherwise.
     */
    private static boolean isLucky(int number) {
        // Convert the number to a string
        String numberString = String.valueOf(number);

        // Check if the number contains any digits other than 4 or 7
        for (char digit : numberString.toCharArray()) {
            if (digit != '4' && digit != '7') {
                return false;
            }
        }

        // Check if the number contains an even number of 4s
        int count4s = 0;
        for (char digit : numberString.toCharArray()) {
            if (digit == '4') {
                count4s++;
            }
        }

        if (count4s % 2 == 0) {
            return false;
        }

        // The number is a lucky number
        return true;
    }
}
