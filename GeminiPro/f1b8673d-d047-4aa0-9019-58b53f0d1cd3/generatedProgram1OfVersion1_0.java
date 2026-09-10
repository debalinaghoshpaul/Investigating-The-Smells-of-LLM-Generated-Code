import java.util.Scanner;

public class CircularPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        boolean isCircularPrime = true;

        // Check if the number is prime
        if (!isPrime(number)) {
            isCircularPrime = false;
        } else {
            // Create a string representation of the number
            String numberString = String.valueOf(number);

            // Iterate over the digits of the number
            for (int i = 0; i < numberString.length(); i++) {
                // Rotate the digits of the number
                numberString = numberString.substring(1) + numberString.charAt(0);

                // Convert the rotated number back to an integer
                int rotatedNumber = Integer.parseInt(numberString);

                // Check if the rotated number is prime
                if (!isPrime(rotatedNumber)) {
                    isCircularPrime = false;
                    break;
                }
            }
        }

        if (isCircularPrime) {
            System.out.println(number + " is a Circular Prime number.");
        } else {
            System.out.println(number + " is not a Circular Prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
