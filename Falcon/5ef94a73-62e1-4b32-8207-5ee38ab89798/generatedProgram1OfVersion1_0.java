import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octalNumber = scanner.nextInt();
        System.out.println("The equivalent hexadecimal number is: " + octalToHexadecimal(octalNumber));
    }

    public static int octalToHexadecimal(int octalNumber) {
        int hexadecimalNumber = 0;
        while (octalNumber!= 0) {
            hexadecimalNumber = (octalNumber % 16) + 10;
            octalNumber = octalNumber / 16;
        }
        return hexadecimalNumber;
    }
}

