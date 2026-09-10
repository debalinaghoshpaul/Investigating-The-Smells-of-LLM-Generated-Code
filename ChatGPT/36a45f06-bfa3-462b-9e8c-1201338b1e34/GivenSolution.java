import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Input any octal number: ");
        int octalNumber = scanner.nextInt();

        int decimalNumber = convertOctalToDecimal(octalNumber);
        int binaryNumber = convertDecimalToBinary(decimalNumber);

        System.out.println("Equivalent binary number: " + binaryNumber);
    }

    public static int octalToDecimal(int octalNumber) {
        int decimalNumber = 0, i = 0;
        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return decimalNumber;
    }

    public static int decimalToBinary(int decimalNumber) {
        int binaryNumber = 0, i = 1;
        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        return binaryNumber;
    }
}
