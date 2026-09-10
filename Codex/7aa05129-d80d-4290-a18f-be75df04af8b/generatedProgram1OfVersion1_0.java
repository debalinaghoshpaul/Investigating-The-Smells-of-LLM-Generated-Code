import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        // Calculate the sum of the digits
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Write the number of each digit of the sum in English
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] counts = new int[10];
        while (sum > 0) {
            counts[sum % 10]++;
            sum /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                System.out.println(digits[i] + ": " + counts[i]);
            }
        }
    }
}
