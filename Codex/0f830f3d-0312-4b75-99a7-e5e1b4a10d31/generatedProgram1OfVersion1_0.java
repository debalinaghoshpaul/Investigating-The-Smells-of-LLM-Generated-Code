// Base class Shape
abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

// Triangle subclass
class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Square square = new Square(4);
        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        Triangle triangle = new Triangle(3, 6);
        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}