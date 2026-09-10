import java.util.Scanner;

public class FloatingPointAdjacentToInfinity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input floating-point number
        System.out.println("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Get the next floating-point adjacent to positive infinity
        double nextPositiveAdjacent = Double.longBitsToDouble(Double.doubleToLongBits(number) + 1);

        // Get the next floating-point adjacent to negative infinity
        double nextNegativeAdjacent = Double.longBitsToDouble(Double.doubleToLongBits(number) - 1);

        // Print the results
        System.out.println("The next floating-point adjacent to positive infinity is: " + nextPositiveAdjacent);
        System.out.println("The next floating-point adjacent to negative infinity is: " + nextNegativeAdjacent);
    }
}
