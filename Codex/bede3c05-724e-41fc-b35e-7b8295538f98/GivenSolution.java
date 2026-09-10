//Shape.java
abstract class Shape {
  public abstract void draw();

  public abstract double calculateArea();
}

//Circle.java
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  protected double getRadius() {
    return radius;
  }
}
//Cylinder.java
class Cylinder extends Circle {
  private double height;

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a cylinder");
  }

  @Override
  public double calculateArea() {
    // Calculate the total surface area of the cylinder (including the circular top and bottom)
    double circleArea = super.calculateArea();
    double sideArea = 2 * Math.PI * getRadius() * height;
    return 2 * circleArea + sideArea;
  }
}
//Main.java
public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle(7.0);
    Shape cylinder = new Cylinder(4.0, 9.0);

    drawShapeAndCalculateArea(circle);
    drawShapeAndCalculateArea(cylinder);
  }

  public static void drawShapeAndCalculateArea(Shape shape) {
    shape.draw();
    double area = shape.calculateArea();
    System.out.println("Area: " + area);
  }
}
