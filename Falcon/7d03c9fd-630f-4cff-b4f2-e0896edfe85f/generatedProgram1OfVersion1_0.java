public interface Shape {
    double getArea();
}

public class Rectangle implements Shape {
    @Override
    public double getArea() {
        return width * height;
    }
}

public class Circle implements Shape {
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Triangle implements Shape {
    @Override
    public double getArea() {
        return 0.5 * Math.pow(base, 2) + 0.5 * Math.pow(height, 2);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
    }
}

