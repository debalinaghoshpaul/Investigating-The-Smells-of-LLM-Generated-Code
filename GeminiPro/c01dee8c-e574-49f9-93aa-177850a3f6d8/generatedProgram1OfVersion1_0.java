import java.util.Scanner;

public class PolygonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of sides on the polygon
        System.out.print("Input the number of sides on the polygon: ");
        int n = input.nextInt();

        // Input the length of one of the sides
        System.out.print("Input the length of one of the sides: ");
        double s = input.nextDouble();

        // Calculate the area of the polygon
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        // Print the area of the polygon
        System.out.println("The area is: " + area);
    }
}
