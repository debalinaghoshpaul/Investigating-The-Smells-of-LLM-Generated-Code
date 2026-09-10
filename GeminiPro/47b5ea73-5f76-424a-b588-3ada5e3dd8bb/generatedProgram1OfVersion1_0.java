import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        // Calculate the square of the number
        int square = number * number;

        // Check if the square ends in the same digits as the number itself
        String numberString = Integer.toString(number);
        String squareString = Integer.toString(square);
        if (numberString.endsWith(squareString)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }
    }
}
