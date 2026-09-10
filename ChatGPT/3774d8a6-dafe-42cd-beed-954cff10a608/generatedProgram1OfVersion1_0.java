import java.util.Scanner;

public class PentagonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the length of the side of the pentagon
        System.out.println("Enter the length of the side of the pentagon: ");
        double sideLength = input.nextDouble();

        // Read the apothem of the pentagon
        System.out.println("Enter the apothem of the pentagon: ");
        double apothem = input.nextDouble();

        // Calculate the area of the pentagon
        double area = (5 * sideLength * apothem) / 2;

        // Print the area of the pentagon
        System.out.println("The area of the pentagon is: " + area);
    }
}
