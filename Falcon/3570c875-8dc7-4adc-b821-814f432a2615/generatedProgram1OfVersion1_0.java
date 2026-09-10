import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("These numbers are different.");
        } else {
            System.out.println("These numbers are the same up to two decimal places.");
        }
    }
}
// 