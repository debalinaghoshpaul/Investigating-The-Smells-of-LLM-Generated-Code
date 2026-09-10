// Shape class
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void calculateArea() {
        System.out.println("Calculating area of a shape");
    }
}

// Circle class
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Cylinder class
class Cylinder extends Circle {
    @Override
    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    public void calculateArea() {
        System.out.println("Calculating surface area of a cylinder");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.calculateArea();

        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();

        Cylinder cylinder = new Cylinder();
        cylinder.draw();
        cylinder.calculateArea();
    }
}