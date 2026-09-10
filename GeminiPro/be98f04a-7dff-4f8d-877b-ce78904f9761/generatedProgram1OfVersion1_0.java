// Shape2D.java
// Abstract class Shape2D defines draw() and resize() methods.

abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
}

// Rectangle.java
// Rectangle class extends Shape2D and implements draw() and resize() methods.

class Rectangle extends Shape2D {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

    @Override
    void resize(double factor) {
        width *= factor;
        height *= factor;
    }
}

// Circle.java
// Circle class extends Shape2D and implements draw() and resize() methods.

class Circle extends Shape2D {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    void resize(double factor) {
        radius *= factor;
    }
}

// Main.java
// Main class to test the Rectangle and Circle classes.

public class Main {
    public static void main(String[] args) {
        // Create a rectangle and a circle.
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Circle circle = new Circle(3.0);

        // Draw and resize the rectangle.
        rectangle.draw();
        rectangle.resize(1.5);
        rectangle.draw();

        // Draw and resize the circle.
        circle.draw();
        circle.resize(2.0);
        circle.draw();
    }
}
