import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the console
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Check if the number is negative, zero, or positive
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }
    }
}
