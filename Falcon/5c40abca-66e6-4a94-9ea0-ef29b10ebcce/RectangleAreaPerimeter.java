import java.util.Scanner;

public class RectangleAreaPerimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the width and height of the rectangle from the user.
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        // Calculate the area and perimeter of the rectangle.
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Print the area and perimeter of the rectangle.
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
