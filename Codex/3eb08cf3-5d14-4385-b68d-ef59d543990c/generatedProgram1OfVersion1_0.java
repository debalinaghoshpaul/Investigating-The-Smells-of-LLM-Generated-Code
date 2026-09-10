import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the hexadecimal number from the user
        System.out.println("Input a hexadecimal number: ");
        String hexNumber = input.nextLine();

        // Convert the hexadecimal number to decimal
        int decimalNumber = Integer.parseInt(hexNumber, 16);

        // Print the decimal number
        System.out.println("Equivalent decimal number is: " + decimalNumber);
    }
}
