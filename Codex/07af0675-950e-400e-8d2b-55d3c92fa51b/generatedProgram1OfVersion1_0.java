import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the radius of the circle from the user.
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area of the circle.
        double area = Math.PI * radius * radius;

        // Calculate the perimeter of the circle.
        double perimeter = 2 * Math.PI * radius;

        // Print the area and perimeter of the circle.
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
