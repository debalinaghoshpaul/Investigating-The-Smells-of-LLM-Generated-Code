public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setArea(int area) {
        this.width = this.height = 0;
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.width = this.height = 0;
        this.perimeter = perimeter;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.setArea(4);
        rectangle.setPerimeter(6);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

