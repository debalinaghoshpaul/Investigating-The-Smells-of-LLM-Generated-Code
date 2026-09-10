import java.util.Scanner;

public class PINValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the PIN from the user.
        System.out.println("Enter your PIN:");
        String pin = scanner.nextLine();

        // Validate the PIN.
        boolean valid = validatePIN(pin);

        // Print the result.
        if (valid) {
            System.out.println("Your PIN is valid.");
        } else {
            System.out.println("Your PIN is invalid.");
        }
    }

    public static boolean validatePIN(String pin) {
        // Check if the PIN is null or empty.
        if (pin == null || pin.isEmpty()) {
            return false;
        }

        // Check if the PIN is the correct length.
        if (pin.length() != 4 && pin.length() != 6 && pin.length() != 8) {
            return false;
        }

        // Check if the PIN contains only digits.
        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // The PIN is valid.
        return true;
    }
}
