import java.util.Scanner;

public class CountZeroBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer
        System.out.print("Input first number: ");
        int number = scanner.nextInt();

        // Convert the integer to binary representation
        String binaryRepresentation = Integer.toBinaryString(number);

        // Count the number of zero bits
        int count = 0;
        for (char bit : binaryRepresentation.toCharArray()) {
            if (bit == '0') {
                count++;
            }
        }

        // Print the binary representation and the number of zero bits
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
        System.out.println("Number of zero bits: " + count);
    }
}
