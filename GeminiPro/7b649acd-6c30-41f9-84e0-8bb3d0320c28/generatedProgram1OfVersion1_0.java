import java.util.Scanner;

public class CountDecimalPlaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number from the user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Convert the number to a string
        String numberString = Double.toString(number);

        // Find the index of the decimal point
        int decimalIndex = numberString.indexOf('.');

        // If there is no decimal point, then the number has no decimal places
        if (decimalIndex == -1) {
            System.out.println("The number has no decimal places.");
        } else {
            // Get the substring of the number after the decimal point
            String decimalPlaces = numberString.substring(decimalIndex + 1);

            // Count the number of characters in the decimal places substring
            int decimalPlacesCount = decimalPlaces.length();

            // Print the number of decimal places
            System.out.println("The number has " + decimalPlacesCount + " decimal places.");
        }
    }
}
