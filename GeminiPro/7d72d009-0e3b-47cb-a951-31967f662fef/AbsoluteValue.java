import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the floating value from the user
        System.out.print("Enter a floating value: ");
        float value = scanner.nextFloat();

        // Convert the floating value to its absolute value
        float absoluteValue = Math.abs(value);

        // Print the absolute value
        System.out.println("The absolute value is: " + absoluteValue);
    }
}
