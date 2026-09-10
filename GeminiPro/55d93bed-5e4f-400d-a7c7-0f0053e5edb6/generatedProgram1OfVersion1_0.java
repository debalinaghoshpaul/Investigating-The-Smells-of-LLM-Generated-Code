// Java program to calculate the Binomial Coefficient

import java.util.Scanner;

public class BinomialCoefficient {

    // Calculates the binomial coefficient using the recursive formula
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two positive numbers
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Calculate the binomial coefficient
        int result = binomialCoefficient(n, k);

        // Print the result
        System.out.println(result);
    }
}
