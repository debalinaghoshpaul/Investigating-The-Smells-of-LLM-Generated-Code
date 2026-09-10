import java.util.Scanner;

public class RoundFloat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a float value of a number from the user
        System.out.println("Enter a float value of a number:");
        float number = scanner.nextFloat();

        // Round the float value using the round() method
        float roundedNumber = Math.round(number);

        // Print the rounded float value
        System.out.println("The rounded float value is: " + roundedNumber);
    }
}
