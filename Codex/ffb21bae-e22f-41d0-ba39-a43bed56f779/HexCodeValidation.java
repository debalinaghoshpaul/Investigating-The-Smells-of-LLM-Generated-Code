import java.util.Scanner;
import java.util.regex.Pattern;

public class HexCodeValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a valid hex code:");
        String input = scanner.nextLine();

        boolean isValid = Pattern.matches("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$", input);

        if (isValid) {
            System.out.println("The string is a valid hex code.");
        } else {
            System.out.println("The string is not a valid hex code.");
        }
    }
}
