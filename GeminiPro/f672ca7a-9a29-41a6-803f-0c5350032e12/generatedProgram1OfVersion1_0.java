import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three numbers from the user
        System.out.println("Input the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Input the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Input the third number:");
        int thirdNumber = scanner.nextInt();

        // Compute the average of the three numbers
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;

        // Print the average value
        System.out.println("The average value is " + average);
    }
}
