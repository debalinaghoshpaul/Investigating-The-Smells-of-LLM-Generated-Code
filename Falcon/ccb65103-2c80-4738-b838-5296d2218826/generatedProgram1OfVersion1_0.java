import java.util.Scanner;

public class OctalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        System.out.print("Octal number is: " + octalNumber(decimalNumber));
    }

    public static int octalNumber(int decimalNumber) {
        int octalNumber = 0;
        while (decimalNumber!= 0) {
            octalNumber = octalNumber * 8 + decimalNumber % 8;
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }
}

