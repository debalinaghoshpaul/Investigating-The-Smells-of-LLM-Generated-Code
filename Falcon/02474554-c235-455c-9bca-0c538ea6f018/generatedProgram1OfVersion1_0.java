// Figure.java
// Abstract class Figure

abstract class Figure {
    public void erase() {
        System.out.println("Figure.erase()");
    }

    public void draw() {
        System.out.println("Figure.draw()");
    }

    public void center() {
        System.out.println("Figure.center()");
        erase();
        draw();
    }
}

// Rectangle.java
// Class Rectangle

class Rectangle extends Figure {
    public void erase() {
        System.out.println("Rectangle.erase()");
    }

    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}

// Triangle.java
// Class Triangle

class Triangle extends Figure {
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    public void draw() {
        System.out.println("Triangle.draw()");
    }
}

// Main.java
// Test class

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(), new Triangle()};

        for (Figure figure : figures) {
            figure.center();
            System.out.println();
        }
    }
}
