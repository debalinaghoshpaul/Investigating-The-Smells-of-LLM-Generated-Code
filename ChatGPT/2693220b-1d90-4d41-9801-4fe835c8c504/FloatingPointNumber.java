import java.util.Scanner;

public class FloatingPointNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("Positive small");
            } else if (number > 1_000_000) {
                System.out.println("Positive large");
            } else {
                System.out.println("Positive");
            }
        } else {
            if (number > -1) {
                System.out.println("Negative small");
            } else if (number < -1_000_000) {
                System.out.println("Negative large");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
