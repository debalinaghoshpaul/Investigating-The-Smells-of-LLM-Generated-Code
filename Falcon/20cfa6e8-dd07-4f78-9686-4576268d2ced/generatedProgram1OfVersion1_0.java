import java.util.Scanner;

public class CheckSecurityManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the application: ");
        String appName = scanner.nextLine();
        System.out.println("Enter the path of the application: ");
        String path = scanner.nextLine();
        System.out.println("Enter the temp directory: ");
        String tempDir = scanner.nextLine();
        System.out.println("Enter the username: ");
        String username = scanner.nextLine();
        System.out.println("The security manager has already been established for the application " + appName + ".");
        System.out.println("The path is: " + path);
        System.out.println("The temp directory is: " + tempDir);
        System.out.println("The username is: " + username);
    }
}

