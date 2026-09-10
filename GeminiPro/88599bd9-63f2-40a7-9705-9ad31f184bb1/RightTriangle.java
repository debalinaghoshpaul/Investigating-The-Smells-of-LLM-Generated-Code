import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three lengths
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check if the three sides form a right triangle
        boolean isRightTriangle = a * a + b * b == c * c;

        // Print the result
        if (isRightTriangle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
