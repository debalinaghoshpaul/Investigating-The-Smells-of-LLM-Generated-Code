// Resizable.java
// Interface Resizable with methods resizeWidth(int width) and resizeHeight(int height)

interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

// Rectangle.java
// Class Rectangle that implements the Resizable interface

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

// Main.java
// Main class to test the Rectangle class

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Initial dimensions: " + rectangle.getWidth() + " x " + rectangle.getHeight());

        rectangle.resizeWidth(10);
        rectangle.resizeHeight(8);

        System.out.println("Resized dimensions: " + rectangle.getWidth() + " x " + rectangle.getHeight());
    }
}
