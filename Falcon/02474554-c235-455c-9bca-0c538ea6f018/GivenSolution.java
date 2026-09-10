package chapter_eight;


/**
 * 5. Consider a graphics system that has classes for various figures—say, rectangles,
 * boxes, triangles, circles, and so on. For example, a rectangle might have data
 * members’ height, width, and center point, while a box and circle might have only
 * a center point and an edge length or radius, respectively. In a well-designed system,
 * these would be derived from a common class, Figure. You are to implement such
 * a system.
 *  The class Figure is the base class. You should add only Rectangle and Triangle
 * classes derived from Figure. Each class has stubs for methods erase and draw.
 * Each of these methods outputs a message telling the name of the class and what
 * method has been called. Because these are just stubs, they do nothing more than
 * output this message. The method center calls the erase and draw methods to
 * erase and redraw the figure at the center. Because you have only stubs for erase
 * and draw, center will not do any “centering” but will call the methods erase and
 * draw, which will allow you to see which versions of draw and center it calls.
 * Also, add an output message in the method center that announces that center is
 * being called. The methods should take no arguments. Also, define a demonstration
 * program for your classes.
 *  For a real example, you would have to replace the definition of each of these
 * methods with code to do the actual drawing. You will be asked to do this in
 * Programming Project 8.6.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_05
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(1, 2, 3);
        Rectangle rectangle = new Rectangle(5, 5);

        /*
        * center() called from Triangle
        * erase() called from Triangle
        * draw() called from Triangle
        * */
        triangle.center();

        System.out.println();

        /*
        * center() called from Rectangle
        * erase() called from Rectangle
        * draw() called from Rectangle
        * */
        rectangle.center();
    }
}

package chapter_eight;

public abstract class Figure
{
    private int centerX;
    private int centerY;

    abstract void center();
    abstract void draw();
    abstract void erase();

    public int getCenterX()
    {
        return centerX;
    }

    public void setCenterX(int centerX)
    {
        this.centerX = centerX;
    }

    public int getCenterY()
    {
        return centerY;
    }

    public void setCenterY(int centerY)
    {
        this.centerY = centerY;
    }
}

package chapter_eight;

public class Rectangle extends Figure
{
    private int width, height;


    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height,
                    int centerX, int centerY)
    {
        this.width = width;
        this.height = height;
        setCenterX(centerX); setCenterY(centerY);
    }


    @Override
    void center()
    {
        System.out.println("center() called from Rectangle");
        erase();
        draw();
    }

    @Override
    void draw()
    {
        System.out.println("draw() called from Rectangle");
    }

    @Override
    void erase()
    {
        System.out.println("erase() called from Rectangle");
    }
}

package chapter_eight;

public class Triangle extends Figure
{
    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(int side1, int side2,
                    int side3, int centerX
                    , int centerY)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setCenterX(centerX); setCenterY(centerY);
    }

    @Override
    void center()
    {
        System.out.println("center() called from Triangle");
        erase();
        draw();
    }

    @Override
    void draw()
    {
        System.out.println("draw() called from Triangle");
    }

    @Override
    void erase()
    {
        System.out.println("erase() called from Triangle");
    }
}



