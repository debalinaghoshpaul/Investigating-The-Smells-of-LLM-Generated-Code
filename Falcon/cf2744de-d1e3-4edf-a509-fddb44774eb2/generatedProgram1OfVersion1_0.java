import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

// 