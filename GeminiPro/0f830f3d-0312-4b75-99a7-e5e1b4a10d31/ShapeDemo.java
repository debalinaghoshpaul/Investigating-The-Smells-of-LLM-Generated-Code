// Base class Shape
abstract class Shape {
    // Abstract method draw() will be implemented in subclasses
    public abstract void draw();

    // Abstract method calculateArea() will be implemented in subclasses
    public abstract double calculateArea();
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Override draw() method to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // Override calculateArea() method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Override draw() method to draw a square
    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLength);
    }

    // Override calculateArea() method to calculate the area of a square
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override draw() method to draw a triangle
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

    // Override calculateArea() method to calculate the area of a triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the Shape hierarchy
public class ShapeDemo {
    public static void main(String[] args) {
        // Create objects of each subclass
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0);

        // Draw each shape
        circle.draw();
        square.draw();
        triangle.draw();

        // Calculate and print the area of each shape
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
