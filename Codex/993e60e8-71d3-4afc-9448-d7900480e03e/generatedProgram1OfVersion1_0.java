import java.util.Scanner;

public class SameRightmostDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the three integers from the user
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = input.nextInt();

        // Check if two or more of the integers have the same rightmost digit
        boolean sameRightmostDigit = false;
        if (firstNumber % 10 == secondNumber % 10 || firstNumber % 10 == thirdNumber % 10 || secondNumber % 10 == thirdNumber % 10) {
            sameRightmostDigit = true;
        }

        // Print the result
        System.out.println("The result is: " + sameRightmostDigit);
    }
}
