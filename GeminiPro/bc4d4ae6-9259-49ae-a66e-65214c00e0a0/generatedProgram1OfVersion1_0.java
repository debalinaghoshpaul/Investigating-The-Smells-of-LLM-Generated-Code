import java.util.Scanner;

public class ReadConsoleInput {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a line of text from the console
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Read an integer from the console
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Read a double from the console
        System.out.println("Enter your height in inches:");
        double height = scanner.nextDouble();

        // Print the input values
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
    }
}
