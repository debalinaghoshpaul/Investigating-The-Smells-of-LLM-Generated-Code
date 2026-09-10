import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(num));
    }
}

