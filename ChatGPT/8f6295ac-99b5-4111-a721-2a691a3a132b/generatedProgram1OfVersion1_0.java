// Importing the necessary packages
import java.util.Scanner;

public class BabylonianAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a positive number: ");
        double n = input.nextDouble();
        
        // Initializing guess
        double guess = n / 2.0;
        
        // Iterating through the Babylonian algorithm five times
        for (int i = 0; i < 5; i++) {
            double r = n / guess;
            guess = (guess + r) / 2.0;
        }
        
        // Printing the square root of the number to two decimal places
        System.out.printf("Square root of %.2f is %.2f\n", n, guess);
        
        input.close();
    }
}