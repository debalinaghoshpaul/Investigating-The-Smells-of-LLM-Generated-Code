import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double perimeter = 2 * 3.14 * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

