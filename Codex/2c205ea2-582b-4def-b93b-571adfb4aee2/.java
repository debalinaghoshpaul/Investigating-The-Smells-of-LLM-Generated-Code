// Circle.java

// A simple Java program to define a Circle class that extends the Shape class.

public class Circle extends Shape {

    // Declare the radius instance variable.
    private double radius;

    // Constructor to initialize the radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the getPerimeter() method to calculate the perimeter of a circle.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override the getArea() method to calculate the area of a circle.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
