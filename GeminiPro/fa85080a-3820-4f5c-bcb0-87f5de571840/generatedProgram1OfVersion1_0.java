// Drawable.java
public interface Drawable {
    void draw();
}

// Circle.java
public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Rectangle.java
public class Rectangle implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }
}

// Triangle.java
public class Triangle implements Drawable {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with sides " + sideA + ", " + sideB + ", and " + sideC);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(10, 5);
        Drawable triangle = new Triangle(3, 4, 5);

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
