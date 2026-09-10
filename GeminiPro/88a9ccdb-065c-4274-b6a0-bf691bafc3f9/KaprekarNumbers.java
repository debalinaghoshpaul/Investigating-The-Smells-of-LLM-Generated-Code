import java.util.Scanner;

public class KaprekarNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the upper bound from the user.
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        // Find all Kaprekar numbers less than the upper bound.
        int count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isKaprekar(i)) {
                System.out.printf("%d\t%d\t%d\n", i, i * i, i * i / 10 + i * i % 10);
                count++;
            }
        }

        // Print the count of Kaprekar numbers.
        System.out.printf("%d Kaprekar numbers.\n", count);
    }

    private static boolean isKaprekar(int n) {
        // Calculate the square of the number.
        int square = n * n;

        // Get the length of the square.
        int length = (int) Math.log10(square) + 1;

        // Split the square into two parts.
        int left = square / (int) Math.pow(10, length / 2);
        int right = square % (int) Math.pow(10, length / 2);

        // Check if the sum of the two parts is equal to the original number.
        return left + right == n;
    }
}
