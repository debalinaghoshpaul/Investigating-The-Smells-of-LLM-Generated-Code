import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        System.out.println("Hexadecimal number is: " + Integer.toHexString(num));
    }
}

