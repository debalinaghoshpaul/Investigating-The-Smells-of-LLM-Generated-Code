import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three numbers from the user
        System.out.println("Input the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3 = scanner.nextInt();

        // Find the greatest number
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        // Print the greatest number
        System.out.println("The greatest: " + greatest);
    }
}
