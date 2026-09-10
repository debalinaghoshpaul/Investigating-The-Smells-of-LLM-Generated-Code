import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Calculate the square, cube, and fourth power of the number
        int square = number * number;
        int cube = number * number * number;
        int fourthPower = number * number * number * number;

        // Display the results
        System.out.println("The square of " + number + " is " + square);
        System.out.println("The cube of " + number + " is " + cube);
        System.out.println("The fourth power of " + number + " is " + fourthPower);
    }
}
