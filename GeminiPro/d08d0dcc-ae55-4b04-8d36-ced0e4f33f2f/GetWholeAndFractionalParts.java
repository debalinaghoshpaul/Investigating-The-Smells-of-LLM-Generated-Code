import java.util.Scanner;

public class GetWholeAndFractionalParts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input double value
        System.out.println("Enter a double value: ");
        double number = scanner.nextDouble();

        // Get the whole part
        int wholePart = (int) number;

        // Get the fractional part
        double fractionalPart = number - wholePart;

        // Print the whole and fractional parts
        System.out.println("The whole part is: " + wholePart);
        System.out.println("The fractional part is: " + fractionalPart);
    }
}
