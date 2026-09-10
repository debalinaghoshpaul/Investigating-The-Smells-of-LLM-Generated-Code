import java.util.Scanner;

public class HexDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        int hexNumber = scanner.nextInt();
        System.out.print("Equivalent decimal number is: ");
        int decimalNumber = Integer.parseInt(String.valueOf(hexNumber), 16);
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
    }
}

// 