import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int digit = 0;
        while (sum > 0) {
            digit = sum % 10;
            sum = sum / 10;
        }
        System.out.println("The digit number of the sum of two given integers is: " + digit);
    }
}

