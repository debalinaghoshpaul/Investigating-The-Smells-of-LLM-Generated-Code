import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binaryNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String octalNumber = Integer.toString(decimalNumber, 8);
        System.out.println("Octal number: " + octalNumber);
    }
}
