import java.util.Scanner;

// Define the abstract class Shape with two abstract methods
abstract class Shape {
    protected String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Define the Circle class that extends the Shape class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        setName("Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Define the Triangle class that extends the Shape class
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setName("Triangle");
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the radius of the circle
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a circle object
        Circle circle = new Circle(radius);

        // Print the area and perimeter of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());

        // Get the sides of the triangle
        System.out.println("Enter the three sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Create a triangle object
        Triangle triangle = new Triangle(side1, side2, side3);

        // Print the area and perimeter of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
