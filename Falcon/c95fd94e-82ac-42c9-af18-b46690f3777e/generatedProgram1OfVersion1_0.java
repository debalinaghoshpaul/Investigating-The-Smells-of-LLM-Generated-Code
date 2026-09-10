import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double area = 3.14 * radius * radius;
        double perimeter = 2 * radius * radius * 3.14;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

