import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double guess = number / 2;
        double error = 0.0001; // Adjust the error tolerance as needed

        while (Math.abs(guess * guess - number) > error) {
            guess = (guess + number / guess) / 2;
        }

        System.out.println("Square root of " + number + " is " + guess);
    }
}
