import java.util.Scanner;

public class MultiplyTwoIntegersWithoutMultiplication {

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        int result = 0;
        int sign = 1;

        if (a < 0) {
            sign = -1;
            a = -a;
        }

        if (b < 0) {
            sign = -sign;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }

            a <<= 1;
            b >>= 1;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int result = multiply(a, b);

        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
