import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = calculateBinomialCoefficient(n, k);
        System.out.println("Binomial Coefficient of " + n + " and " + k + " is: " + result);

        scanner.close();
    }

    private static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
        }
    }
}
