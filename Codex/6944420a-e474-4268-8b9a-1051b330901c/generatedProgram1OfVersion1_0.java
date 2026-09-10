import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Calculate the quotient
        int quotient = num1 / num2;

        // Print the quotient
        System.out.println("The quotient is: " + quotient);
    }
}
