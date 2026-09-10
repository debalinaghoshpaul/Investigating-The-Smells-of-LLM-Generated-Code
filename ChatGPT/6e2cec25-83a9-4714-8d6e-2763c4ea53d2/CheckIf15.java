import java.util.Scanner;

public class CheckIf15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // Check if either number is 15
        if (num1 == 15 || num2 == 15) {
            System.out.println("True");
            return;
        }

        // Check if the sum of the numbers is 15
        if (num1 + num2 == 15) {
            System.out.println("True");
            return;
        }

        // Check if the difference of the numbers is 15
        if (Math.abs(num1 - num2) == 15) {
            System.out.println("True");
            return;
        }

        // Otherwise, print false
        System.out.println("False");
    }
}
