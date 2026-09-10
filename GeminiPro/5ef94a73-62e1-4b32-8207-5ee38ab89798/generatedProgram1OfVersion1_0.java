import java.util.Scanner;

public class OctalToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read an octal number from the user
        System.out.print("Input an octal number: ");
        int octalNumber = input.nextInt();

        // Convert the octal number to a hexadecimal number
        String hexadecimalNumber = Integer.toHexString(octalNumber);

        // Print the result
        System.out.println("Equivalent hexadecimal number: " + hexadecimalNumber);
    }
}
