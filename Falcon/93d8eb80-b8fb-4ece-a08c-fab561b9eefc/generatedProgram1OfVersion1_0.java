import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        int s = scanner.nextInt();
        System.out.print("Enter the other two sides of the triangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The area of the triangle is: " + calculateArea(s, a, b));
    }

    public static int calculateArea(int s, int a, int b) {
        int area = (s * (s - a - b)) / 2;
        return area;
    }
}

