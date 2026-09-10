import java.util.Scanner;

public class FlipBits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Calculate the XOR of the two integers
        int xor = num1 ^ num2;

        // Count the number of set bits in the XOR result
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }

        // Print the number of bits required to flip
        System.out.println("Number of bits required to flip: " + count);
    }
}
