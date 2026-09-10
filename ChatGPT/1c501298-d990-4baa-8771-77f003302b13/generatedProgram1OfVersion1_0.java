
public class CircleConstruction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points:");
        System.out.println("Point 1 (x y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Point 2 (x y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Point 3 (x y): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double A = x2 - x1;
        double B = y2 - y1;
        double C = x3 - x1;
        double D = y3 - y1;
        double E = A * (x1 + x2) + B * (y1 + y2);
        double F = C * (x1 + x3) + D * (y1 + y3);
        double G = 2 * (A * (y3 - y2) - B * (x3 - x2));

        double centerX = (D*E - B*F) / G;
        double centerY = (A*F - C*E) / G;
        double radius = Math.sqrt((centerX - x1) * (centerX - x1) + (centerY - y1) * (centerY - y1));

        System.out.println("Central coordinates (x, y) of the circle: (" + centerX + ", " + centerY + ")");
        System.out.println("Radius of the circle: " + radius);
    }
}