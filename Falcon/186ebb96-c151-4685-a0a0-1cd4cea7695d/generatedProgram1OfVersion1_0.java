import java.awt.*;
import java.awt.event.*;

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}

public class ResizableTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 100);
        rect.resizeWidth(200);
        rect.resizeHeight(200);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
    }
}

