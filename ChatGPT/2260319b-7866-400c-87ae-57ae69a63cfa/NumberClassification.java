import java.util.Scanner;

public class NumberClassification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a floating-point number from the user
        System.out.print("Input a number: ");
        float number = scanner.nextFloat();

        // Check if the number is zero
        if (number == 0) {
            System.out.println("Input value: " + number);
            System.out.println("Zero");
        } else {
            // Check if the number is positive or negative
            String sign = number > 0 ? "Positive" : "Negative";

            // Check if the absolute value of the number is less than 1 or greater than 1,000,000
            String magnitude = Math.abs(number) < 1 ? "small" : (Math.abs(number) > 1000000 ? "large" : "");

            // Print the number classification
            System.out.println("Input value: " + number);
            System.out.println(sign + " number" + (magnitude.isEmpty() ? "" : " (" + magnitude + ")"));
        }
    }
}
