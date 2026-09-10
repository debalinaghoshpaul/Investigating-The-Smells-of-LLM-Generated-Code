// Shape.java
// Parent class Shape

abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}

// Circle.java
// Child class Circle

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder.java
// Child class Cylinder

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder with radius " + radius + " and height " + height);
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape cylinder = new Cylinder(5, 10);
        cylinder.draw();
        System.out.println("Total surface area of cylinder: " + cylinder.calculateArea());
    }
}
