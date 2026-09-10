import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Calculate the cube root of the number
        int cubeRoot = (int) Math.cbrt(number);

        // Check if the cube root is an integer
        if (cubeRoot * cubeRoot * cubeRoot == number) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}
