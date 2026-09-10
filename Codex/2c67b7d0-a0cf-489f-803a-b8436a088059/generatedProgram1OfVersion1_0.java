import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        int octal = input.nextInt();
        int decimal = 0;
        int n = 0;

        while(octal != 0) {
            decimal += (octal % 10) * Math.pow(8, n);
            octal /= 10;
            ++n;
        }

        System.out.println("Equivalent decimal number: " + decimal);
    }
}
