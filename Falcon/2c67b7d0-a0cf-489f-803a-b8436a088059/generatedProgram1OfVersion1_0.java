import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octalNumber = scanner.nextInt();
        int decimalNumber = 0;
        while (octalNumber!= 0) {
            decimalNumber = decimalNumber * 8 + octalNumber % 8;
            octalNumber = octalNumber / 8;
        }
        System.out.println("The decimal equivalent of " + octalNumber + " is " + decimalNumber);
    }
}

