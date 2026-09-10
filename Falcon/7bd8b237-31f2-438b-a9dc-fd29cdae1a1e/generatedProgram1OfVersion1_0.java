import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a side of the hexagon: ");
        int length = scanner.nextInt();
        double area = (6 * Math.pow(length, 2) / (4 * Math.tan(Math.PI / 6)));
        System.out.println("The area of the hexagon is: " + area);
    }
}

