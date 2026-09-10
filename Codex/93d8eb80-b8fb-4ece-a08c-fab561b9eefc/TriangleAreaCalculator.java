public class TriangleAreaCalculator {
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        double base = 10;
        double height = 5;
        double area = calculateArea(base, height);
        System.out.println("Area of triangle with base " + base + " and height " + height + " is " + area);
    }
}
