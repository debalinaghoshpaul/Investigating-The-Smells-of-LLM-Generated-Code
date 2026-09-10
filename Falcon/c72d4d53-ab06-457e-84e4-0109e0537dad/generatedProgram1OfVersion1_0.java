import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = 0;
        for (int i = 0; i < num1; i++) {
            product += (num1 & (1 << i));
        }
        for (int i = 0; i < num2; i++) {
            product += (num2 & (1 << i));
        }
        System.out.println("Product of two binary numbers: " + product);
    }
}

// 