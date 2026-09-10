abstract class Shape2D {
    abstract void draw();
    abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the rectangle");
    }
}

class Circle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        rect.draw();
        rect.resize();

        circle.draw();
        circle.resize();
    }
}
