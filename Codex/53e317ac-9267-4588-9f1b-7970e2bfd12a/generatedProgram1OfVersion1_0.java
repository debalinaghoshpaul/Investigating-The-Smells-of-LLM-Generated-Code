import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }

        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        // Handle negative numbers again
        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("Reversed integer: " + reversedNumber);
    }
}
