import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the first integer from the user
        System.out.print("Input first integer: ");
        int firstNumber = input.nextInt();

        // Read the second integer from the user
        System.out.print("Input second integer: ");
        int secondNumber = input.nextInt();

        // Compare the two integers
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " == " + secondNumber);
        } else if (firstNumber != secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
        }

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        }

        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + " <= " + secondNumber);
        } else if (firstNumber >= secondNumber) {
            System.out.println(firstNumber + " >= " + secondNumber);
        }
    }
}
