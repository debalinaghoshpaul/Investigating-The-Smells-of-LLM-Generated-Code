import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the integer value from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Convert the integer to its absolute value
        int absoluteValue = Math.abs(number);

        // Print the absolute value
        System.out.println("The absolute value of " + number + " is " + absoluteValue);
    }
}
