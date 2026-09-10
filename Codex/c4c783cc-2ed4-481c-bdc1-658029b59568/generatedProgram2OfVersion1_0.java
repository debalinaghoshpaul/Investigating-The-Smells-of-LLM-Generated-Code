import java.util.Scanner;

public class ComputeTrailingZerosInFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.println("Enter the number:");
        int n = scanner.nextInt();

        // Initialize the number of trailing zeros to 0
        int trailingZeros = 0;

        // Compute the number of trailing zeros
        for (int i = 5; i <= n; i += 5) {
            int temp = i;
            while (temp % 5 == 0) {
                trailingZeros++;
                temp /= 5;
            }
        }

        // Print the number of trailing zeros
        System.out.println("The number of trailing zeros in " + n + "! is: " + trailingZeros);
    }
}
