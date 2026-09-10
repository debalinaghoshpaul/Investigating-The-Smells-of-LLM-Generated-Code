import java.util.Scanner;

public class PasswordInputDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input password
        System.out.println("Input your Password:");
        String password = scanner.nextLine();

        // Display password
        System.out.println("Your password was: " + password);
    }
}
