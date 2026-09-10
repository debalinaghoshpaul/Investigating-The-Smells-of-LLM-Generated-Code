// Shape.java
// Parent class Shape

abstract class Shape {
    abstract double getArea();
}

// Rectangle.java
// Child class Rectangle

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// Main.java
// Driver class

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0, 5.0);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
