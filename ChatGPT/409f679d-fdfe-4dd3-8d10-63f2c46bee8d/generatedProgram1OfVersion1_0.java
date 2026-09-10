// Shape.java
// Parent class Shape with abstract methods for calculating area and perimeter

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}

// Rectangle.java
// Child class Rectangle extending Shape, implementing methods for calculating area and perimeter

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Circle.java
// Child class Circle extending Shape, implementing methods for calculating area and perimeter

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle.java
// Child class Triangle extending Shape, implementing methods for calculating area and perimeter

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double semiperimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

// Main.java
// Main class to test the Shape, Rectangle, Circle, and Triangle classes

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle", 5.0, 10.0);
        System.out.println(rectangle);

        Shape circle = new Circle("Circle", 5.0);
        System.out.println(circle);

        Shape triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        System.out.println(triangle);
    }
}
