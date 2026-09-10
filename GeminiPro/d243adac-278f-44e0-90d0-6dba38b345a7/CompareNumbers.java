import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integers from the user
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();

        // Check if the second number is higher than the first number and the third number is larger than the second number
        boolean result = (b > a && c > b) || c > a;

        // Print the result
        System.out.println("The result is: " + result);
    }
}
