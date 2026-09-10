import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(binomialCoefficient(num1, num2));
    }

    public static int binomialCoefficient(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        if (num1 == 1) {
            return 1;
        }
        if (num2 == 1) {
            return 1;
        }
        return binomialCoefficient(num1 - 1, num2 - 1) + binomialCoefficient(num1, num2 - 1);
    }
}

// 