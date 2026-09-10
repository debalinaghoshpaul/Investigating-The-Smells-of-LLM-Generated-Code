import java.util.Scanner;

public class CheckPointInTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three points of the triangle: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (x1 == x2 && x1 == x3 && y1 == y2 && y1 == y3 && x2 == x3 && y2 == y3) {
            System.out.println("Point (x1, y1) is in the triangle");
        } else {
            System.out.println("Point (x1, y1) is not in the triangle");
        }
    }
}

// 