import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("Is Armstrong number? true");
        } else {
            System.out.println("Is Armstrong number? false");
        }
    }
}
