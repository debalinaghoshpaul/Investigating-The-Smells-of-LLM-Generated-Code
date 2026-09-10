public class Shape {
    public double calculateArea() {
        return 0;
    }
}

public class Circle extends Shape {
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle extends Shape {
    public double calculateArea() {
        return width * height;
    }
}

public class Triangle extends Shape {
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}

