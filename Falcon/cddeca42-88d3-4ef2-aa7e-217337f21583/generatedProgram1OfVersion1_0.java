import java.util.Scanner;

public class HexToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        int hexNumber = scanner.nextInt();
        System.out.println("Equivalent of octal number is: " + Integer.toOctalString(hexNumber));
    }
}

