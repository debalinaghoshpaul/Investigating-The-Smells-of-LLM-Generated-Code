import java.util.Scanner;

public class DigitCombinations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of digits and the sum
        System.out.println("Enter the number of digits (n) and the sum (s): ");
        int n = input.nextInt();
        int s = input.nextInt();

        // Create an array to store the digits
        int[] digits = new int[n];

        // Read the digits
        for (int i = 0; i < n; i++) {
            digits[i] = input.nextInt();
        }

        // Find the number of combinations
        int count = 0;
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += digits[j];
                }
            }
            if (sum == s) {
                count++;
            }
        }

        // Print the number of combinations
        System.out.println("The number of combinations is: " + count);
    }
}
