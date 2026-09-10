import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two integers from the user
        System.out.println("Enter first integer: ");
        int firstInteger = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int secondInteger = scanner.nextInt();

        // Calculate the sum, difference, product, average, distance, maximum, and minimum
        int sum = firstInteger + secondInteger;
        int difference = Math.abs(firstInteger - secondInteger);
        int product = firstInteger * secondInteger;
        double average = (double) (firstInteger + secondInteger) / 2;
        int distance = Math.abs(firstInteger - secondInteger);
        int max = Math.max(firstInteger, secondInteger);
        int min = Math.min(firstInteger, secondInteger);

        // Print the results
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
