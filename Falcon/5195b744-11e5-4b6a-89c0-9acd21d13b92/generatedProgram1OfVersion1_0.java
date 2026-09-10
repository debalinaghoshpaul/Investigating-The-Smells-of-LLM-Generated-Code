import java.util.Scanner;

public class EfficientPolynomialCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter a0: ");
        double a0 = scanner.nextDouble();
        System.out.print("Enter a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter a3: ");
        double a3 = scanner.nextDouble();

        double f = (a0 + a1 * x + a2 * x * x + a3 * x * x * x) / (x * x);
        System.out.println("�(x) = " + f);
    }
}

// 