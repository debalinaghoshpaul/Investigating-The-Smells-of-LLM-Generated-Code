import java.util.Scanner;

public class FloatingPointComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two floating-point numbers from the user.
        System.out.print("Input first floating-point number: ");
        float num1 = input.nextFloat();
        System.out.print("Input second floating-point number: ");
        float num2 = input.nextFloat();

        // Round both numbers to two decimal places.
        num1 = (float) (Math.round(num1 * 100) / 100.0);
        num2 = (float) (Math.round(num2 * 100) / 100.0);

        // Check if the two numbers are the same.
        if (num1 == num2) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }
    }
}
