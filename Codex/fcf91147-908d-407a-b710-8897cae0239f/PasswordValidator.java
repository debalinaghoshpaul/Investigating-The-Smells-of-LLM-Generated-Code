public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Check if the password has at least ten characters
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;

        // Iterate through each character in the password
        for (char c : password.toCharArray()) {
            // Check if the character is a letter or a digit
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            // Check if the character is a digit
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // Check if the password contains at least two digits
        if (digitCount < 2) {
            return false;
        }

        return true;
    }
}
