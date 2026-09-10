import java.util.Scanner;

public class TriangleChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three side lengths of the triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (isTriangle(side1, side2, side3)) {
            System.out.println("The given side lengths can form a triangle.");
        } else {
            System.out.println("The given side lengths cannot form a triangle.");
        }
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        } else {
            return false;
        }
    }
}
