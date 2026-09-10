import java.util.Scanner;

public class AmicableNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.println("Input the first number:");
        int num1 = input.nextInt();
        System.out.println("Input the second number:");
        int num2 = input.nextInt();

        // Check if the two numbers are amicable numbers
        boolean areAmicable = areAmicableNumbers(num1, num2);

        // Print the result
        if (areAmicable) {
            System.out.println("These numbers are amicable.");
        } else {
            System.out.println("These numbers are not amicable.");
        }
    }

    /**
     * Checks if the two given numbers are amicable numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return true if the two numbers are amicable, false otherwise
     */
    public static boolean areAmicableNumbers(int num1, int num2) {
        // Find the sum of the proper divisors of the first number
        int sumOfProperDivisors1 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sumOfProperDivisors1 += i;
            }
        }

        // Find the sum of the proper divisors of the second number
        int sumOfProperDivisors2 = 0;
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sumOfProperDivisors2 += i;
            }
        }

        // Check if the sum of the proper divisors of the first number is equal to the second number, and vice versa
        return sumOfProperDivisors1 == num2 && sumOfProperDivisors2 == num1;
    }
}
