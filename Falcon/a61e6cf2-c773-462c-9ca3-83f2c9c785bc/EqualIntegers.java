import java.util.Scanner;

public class EqualIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the four integers from the user
        System.out.print("Input first number: ");
        int num1 = input.nextInt();
        System.out.print("Input second number: ");
        int num2 = input.nextInt();
        System.out.print("Input third number: ");
        int num3 = input.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = input.nextInt();

        // Check if the four integers are equal
        if (num1 == num2 && num1 == num3 && num1 == num4) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }
}
