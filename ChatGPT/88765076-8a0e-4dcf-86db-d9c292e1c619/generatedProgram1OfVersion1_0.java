import java.util.Scanner;

public class Subtract20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integer values from the user
        System.out.println("Input the first number :");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Input the third number :");
        int num3 = scanner.nextInt();

        // Check if any one of the numbers is 20 or more less than the others' subtractions
        boolean is20Less = false;
        if (Math.abs(num1 - num2) >= 20 || Math.abs(num1 - num3) >= 20 || Math.abs(num2 - num3) >= 20) {
            is20Less = true;
        }

        // Print the result
        System.out.println(is20Less);
    }
}
