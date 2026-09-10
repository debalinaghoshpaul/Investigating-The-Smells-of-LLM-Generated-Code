import java.util.Scanner;

public class ValidatePIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        if (pin == 4 || pin == 6 || pin == 8) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }
}

