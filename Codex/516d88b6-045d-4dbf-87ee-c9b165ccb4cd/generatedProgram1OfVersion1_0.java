// Java program to implement an enum called Shape
// with constants representing different geometric shapes

// An enum representing different geometric shapes
enum Shape {
    CIRCLE,
    RECTANGLE,
    SQUARE,
    TRIANGLE
}

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {
        // Create an instance of Shape for each geometric shape
        Shape circle = Shape.CIRCLE;
        Shape rectangle = Shape.RECTANGLE;
        Shape square = Shape.SQUARE;
        Shape triangle = Shape.TRIANGLE;

        // Print the name of each shape
        System.out.println("Circle: " + circle);
        System.out.println("Rectangle: " + rectangle);
        System.out.println("Square: " + square);
        System.out.println("Triangle: " + triangle);
    }
}
