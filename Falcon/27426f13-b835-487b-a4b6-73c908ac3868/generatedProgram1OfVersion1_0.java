import java.util.Scanner;

public class PasswordInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Your password was: " + password);
    }
}

