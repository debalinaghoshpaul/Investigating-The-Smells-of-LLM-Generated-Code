import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int digit = num % 10;
            sum += digit;
        }
        System.out.println("The sum of the digits of " + num + " is: " + sum);
    }
}

// 