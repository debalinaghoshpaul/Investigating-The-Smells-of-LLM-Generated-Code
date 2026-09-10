import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = input.nextInt();
        input.close();

        String octal = "";

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal /= 8;
        }

        System.out.println("Octal number is: " + octal);
    }
}
