// Abstract class GeometricShape
abstract class GeometricShape {
    // Abstract method to calculate area
    public abstract double area();
    
    // Abstract method to calculate perimeter
    public abstract double perimeter();
}

// Subclass Triangle
class Triangle extends GeometricShape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // Calculate area of triangle
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    // Calculate perimeter of triangle
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

// Subclass Square
class Square extends GeometricShape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    // Calculate area of square
    @Override
    public double area() {
        return side * side;
    }
    
    // Calculate perimeter of square
    @Override
    public double perimeter() {
        return 4 * side;
    }
}

// Main class with test cases
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 4, 5, 3, 4);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        
        Square square = new Square(5);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
