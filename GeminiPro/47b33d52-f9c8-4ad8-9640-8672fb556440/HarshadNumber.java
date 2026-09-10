import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        boolean isHarshadNumber = number % sumOfDigits == 0;
        System.out.println(number + (isHarshadNumber ? " is a Harshad Number." : " is not a Harshad Number."));
    }
}
