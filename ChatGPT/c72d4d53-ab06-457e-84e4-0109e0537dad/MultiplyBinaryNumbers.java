import java.util.Scanner;

public class MultiplyBinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two binary numbers from the user
        System.out.println("Input the first binary number:");
        String firstBinaryNumber = scanner.nextLine();
        System.out.println("Input the second binary number:");
        String secondBinaryNumber = scanner.nextLine();

        // Convert the binary numbers to integers
        int firstNumber = Integer.parseInt(firstBinaryNumber, 2);
        int secondNumber = Integer.parseInt(secondBinaryNumber, 2);

        // Multiply the two integers
        int product = firstNumber * secondNumber;

        // Convert the product back to a binary number
        String productBinaryNumber = Integer.toBinaryString(product);

        // Print the product of the two binary numbers
        System.out.println("Product of two binary numbers: " + productBinaryNumber);
    }
}
