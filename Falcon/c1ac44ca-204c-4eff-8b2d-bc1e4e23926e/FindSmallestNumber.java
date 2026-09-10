import java.util.Scanner;

public class FindSmallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the three numbers from the user
        System.out.print("Input the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Input the second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Input the third number: ");
        double thirdNumber = input.nextDouble();

        // Find the smallest number using the Math.min() method
        double smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));

        // Print the smallest number
        System.out.println("The smallest value is " + smallestNumber);
    }
}
