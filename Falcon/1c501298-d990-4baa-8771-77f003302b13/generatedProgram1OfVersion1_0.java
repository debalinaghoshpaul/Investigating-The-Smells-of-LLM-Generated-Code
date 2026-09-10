import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points on the plane surface: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double radius = (x1 + x2 + x3) / 3;
        double centerX = (x1 + x2 + x3) / 2;
        double centerY = (y1 + y2 + y3) / 2;

        System.out.println("Radius: " + radius);
        System.out.println("Center X: " + centerX);
        System.out.println("Center Y: " + centerY);
    }
}

