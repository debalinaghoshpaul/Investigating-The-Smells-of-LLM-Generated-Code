// Circle.java
// Circle Class

class Circle {
  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

// Main.java
// Main Class

public class Main {
  public static void main(String[] args) {
    // Create an instance of Circle
    Circle circle = new Circle();

    // Set the radius using the setter method
    circle.setRadius(7.0);

    // Get the radius using the getter method
    double radius = circle.getRadius();

    // Calculate and print the area and perimeter
    double area = circle.calculateArea();
    double perimeter = circle.calculatePerimeter();

    System.out.println("Circle Radius: " + radius);
    System.out.println("Circle Area: " + area);
    System.out.println("Circle Perimeter: " + perimeter);
  }
}
