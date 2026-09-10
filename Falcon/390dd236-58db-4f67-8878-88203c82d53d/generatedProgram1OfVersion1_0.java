import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octalNumber = scanner.nextInt();
        System.out.println("The equivalent binary number is: " + octalToBinary(octalNumber));
    }

    public static int octalToBinary(int octalNumber) {
        int binaryNumber = 0;
        while (octalNumber!= 0) {
            binaryNumber = binaryNumber * 8 + octalNumber % 8;
            octalNumber /= 8;
        }
        return binaryNumber;
    }
}

// 