import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();

        double squareRoot = Math.sqrt(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
    }
}
