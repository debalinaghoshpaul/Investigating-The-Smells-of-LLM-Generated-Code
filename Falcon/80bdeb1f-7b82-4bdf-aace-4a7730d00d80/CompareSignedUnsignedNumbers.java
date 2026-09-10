import java.util.Scanner;

public class CompareSignedUnsignedNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two numbers from the user.
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Check if the first number is signed or unsigned.
        boolean isNum1Signed = (num1 < 0);

        // Check if the second number is signed or unsigned.
        boolean isNum2Signed = (num2 < 0);

        // Compare the two numbers.
        if (isNum1Signed && !isNum2Signed) {
            System.out.println("The first number is signed and the second number is unsigned. The first number is smaller.");
        } else if (!isNum1Signed && isNum2Signed) {
            System.out.println("The first number is unsigned and the second number is signed. The first number is larger.");
        } else if (isNum1Signed && isNum2Signed) {
            if (num1 < num2) {
                System.out.println("Both numbers are signed and the first number is smaller.");
            } else if (num1 > num2) {
                System.out.println("Both numbers are signed and the first number is larger.");
            } else {
                System.out.println("Both numbers are signed and they are equal.");
            }
        } else {
            if (num1 < num2) {
                System.out.println("Both numbers are unsigned and the first number is smaller.");
            } else if (num1 > num2) {
                System.out.println("Both numbers are unsigned and the first number is larger.");
            } else {
                System.out.println("Both numbers are unsigned and they are equal.");
            }
        }
    }
}
