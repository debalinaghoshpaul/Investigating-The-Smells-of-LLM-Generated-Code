// Main.java

// A simple Java program to test the Shape and Circle classes.

public class Main {

    public static void main(String[] args) {

        // Create a Circle object.
        Circle circle = new Circle(5);

        // Print the perimeter and area of the circle.
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
