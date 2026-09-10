public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width * height;
    }
}

class Triangle extends Shape {
    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return 0.5 * base * height + 0.5 * height;
    }
}
