import java.util.Scanner;

public class CubeOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input from the user
        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        // Iterate over the numbers up to the given limit
        for (int i = 1; i <= numberOfTerms; i++) {
            // Calculate the cube of the number
            int cube = i * i * i;

            // Print the output
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
    }
}
