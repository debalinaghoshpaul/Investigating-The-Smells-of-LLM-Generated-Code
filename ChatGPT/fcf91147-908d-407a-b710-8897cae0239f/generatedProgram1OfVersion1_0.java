import java.util.regex.*;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {

        // Check if the password is null or empty
        if (password == null || password.isEmpty()) {
            return false;
        }

        // Check if the password is at least 10 characters long
        if (password.length() < 10) {
            return false;
        }

        // Check if the password consists of only letters and digits
        if (!password.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        // Check if the password contains at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }

        // If all the checks pass, the password is valid
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] passwords = {"Password123", "password123", "1234567890", "abcdefghij", "12345678901234567890"};

        for (String password : passwords) {
            boolean isValid = isValidPassword(password);
            System.out.println(password + " is " + (isValid ? "valid" : "invalid"));
        }
    }
}
