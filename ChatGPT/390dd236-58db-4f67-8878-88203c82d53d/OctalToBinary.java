import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the octal number from the user
        System.out.println("Input any octal number: ");
        int octalNumber = scanner.nextInt();

        // Convert the octal number to a binary number
        String binaryNumber = "";
        while (octalNumber > 0) {
            int remainder = octalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            octalNumber /= 2;
        }

        // Print the binary number
        System.out.println("Equivalent binary number: " + binaryNumber);
    }
}
