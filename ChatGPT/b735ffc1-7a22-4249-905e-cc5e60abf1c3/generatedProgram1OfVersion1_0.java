import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Dividend: " + num1);
        System.out.println("Divisor: " + num2);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close();
    }
}
