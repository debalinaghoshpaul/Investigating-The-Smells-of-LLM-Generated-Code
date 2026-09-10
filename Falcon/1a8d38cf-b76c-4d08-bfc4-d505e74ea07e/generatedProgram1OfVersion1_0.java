import java.util.Scanner;

public class PronicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number : ");
        int number = input.nextInt();

        // Check if the number is a pronic number
        if (isPronic(number)) {
            System.out.println("Pronic Number.");
        } else {
            System.out.println("Not a Pronic Number.");
        }
    }

    public static boolean isPronic(int number) {
        // Check if the number is negative
        if (number <= 0) {
            return false;
        }

        // Iterate through all the numbers from 1 to the square root of the number
        for (int i = 1; i <= Math.sqrt(number); i++) {
            // Check if the number is the product of two consecutive integers
            if (number == i * (i + 1)) {
                return true;
            }
        }

        // If the number is not the product of two consecutive integers, return false
        return false;
    }
}
