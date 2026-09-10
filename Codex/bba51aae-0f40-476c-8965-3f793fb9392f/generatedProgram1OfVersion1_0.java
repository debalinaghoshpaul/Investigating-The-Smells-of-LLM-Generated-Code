// GeometricShape.java
// Parent class GeometricShape

abstract class GeometricShape {

    // Abstract methods to be implemented by subclasses
    public abstract double area();
    public abstract double perimeter();
}

// Triangle.java
// Child class Triangle

class Triangle extends GeometricShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

// Square.java
// Child class Square

class Square extends GeometricShape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}

// Main.java
// Driver class

public class Main {

    public static void main(String[] args) {

        // Create a Triangle object
        Triangle triangle = new Triangle(3, 4, 5);

        // Print the area and perimeter of the triangle
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        // Create a Square object
        Square square = new Square(5);

        // Print the area and perimeter of the square
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
