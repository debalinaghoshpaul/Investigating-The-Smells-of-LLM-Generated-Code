public class PentagonArea {
    public static double calculateArea(double sideLength) {
        double apothem = sideLength / (2 * Math.tan(Math.PI / 5));
        double area = (5 * sideLength * apothem) / 2;
        return area;
    }

    public static void main(String[] args) {
        double sideLength = 5.0; // Replace with the desired side length
        double area = calculateArea(sideLength);
        System.out.println("The area of the pentagon is: " + area);
    }
}