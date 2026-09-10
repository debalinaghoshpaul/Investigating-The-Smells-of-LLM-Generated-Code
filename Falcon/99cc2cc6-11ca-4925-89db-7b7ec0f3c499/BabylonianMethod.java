import java.util.Scanner;

public class BabylonianMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("The number must be non-negative");
            return;
        }

        // Initialize the guess
        double guess = number / 2;

        // Iterate until the guess is close enough to the square root
        while (Math.abs(guess * guess - number) > 0.001) {
            guess = (guess + number / guess) / 2;
        }

        // Print the square root
        System.out.println("The square root of " + number + " is " + guess);
    }
}
