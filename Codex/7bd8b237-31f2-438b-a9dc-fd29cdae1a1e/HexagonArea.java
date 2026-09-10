import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the length of a side of the hexagon
        System.out.println("Input the length of a side of the hexagon:");
        double sideLength = scanner.nextDouble();

        // Calculate the area of the hexagon
        double area = (6 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 6));

        // Print the area of the hexagon
        System.out.println("The area of the hexagon is:" + area);
    }
}
