import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();

        double smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest value is " + smallest);
    }

    public static double findSmallest(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}