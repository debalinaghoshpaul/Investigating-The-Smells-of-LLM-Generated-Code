import java.util.Scanner;

public class FloorDivisionAndModulus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the dividend and divisor from the user.
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Compute the floor division and floor modulus.
        int floorDivision = dividend / divisor;
        int floorModulus = dividend % divisor;

        // Print the results.
        System.out.println("The floor division is: " + floorDivision);
        System.out.println("The floor modulus is: " + floorModulus);
    }
}
