import java.util.Scanner;

public class FloorDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        int floorDivision = (int) Math.floor(dividend / divisor);
        int floorModulus = (int) Math.floorMod(dividend % divisor, divisor);
        System.out.println("Floor Division: " + floorDivision);
        System.out.println("Floor Modulus: " + floorModulus);
    }
}

// 