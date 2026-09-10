import java.util.Scanner;

public class NarcissisticNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of narcissistic numbers to generate
        System.out.println("How many narcissistic numbers would you like to generate?");
        int num = scanner.nextInt();

        // Generate and display the narcissistic numbers
        int count = 0;
        int i = 0;
        while (count < num) {
            if (isNarcissistic(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }

    /**
     * Checks if a number is narcissistic.
     *
     * @param num The number to check
     * @return True if the number is narcissistic, false otherwise
     */
    public static boolean isNarcissistic(int num) {
        int sum = 0;
        int temp = num;
        int length = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        return sum == num;
    }
}
