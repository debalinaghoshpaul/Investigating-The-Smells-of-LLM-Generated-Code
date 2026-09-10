import java.util.Scanner;

public class AddBinaryNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two binary numbers from the user
        System.out.print("Enter first binary number: ");
        String binary1 = input.nextLine();
        System.out.print("Enter second binary number: ");
        String binary2 = input.nextLine();

        // Add the two binary numbers
        String sum = addBinaryNumbers(binary1, binary2);

        // Print the sum
        System.out.println("Sum of two binary numbers: " + sum);
    }

    private static String addBinaryNumbers(String binary1, String binary2) {
        // Check if the two binary numbers are of the same length
        if (binary1.length() != binary2.length()) {
            // Pad the shorter binary number with zeros
            if (binary1.length() < binary2.length()) {
                binary1 = "0" + binary1;
            } else {
                binary2 = "0" + binary2;
            }
        }

        // Create a string to store the sum
        String sum = "";

        // Add the two binary numbers digit by digit
        for (int i = binary1.length() - 1; i >= 0; i--) {
            // Get the two digits at the current position
            char digit1 = binary1.charAt(i);
            char digit2 = binary2.charAt(i);

            // Add the two digits
            int digitSum = Character.getNumericValue(digit1) + Character.getNumericValue(digit2);

            // Check if the sum is greater than or equal to 2
            if (digitSum >= 2) {
                // If the sum is greater than or equal to 2, then we need to carry over a 1 to the next digit
                digitSum -= 2;
                sum = "1" + sum;
            } else {
                // If the sum is less than 2, then we don't need to carry over a 1 to the next digit
                sum = digitSum + sum;
            }
        }

        // Return the sum
        return sum;
    }
}
