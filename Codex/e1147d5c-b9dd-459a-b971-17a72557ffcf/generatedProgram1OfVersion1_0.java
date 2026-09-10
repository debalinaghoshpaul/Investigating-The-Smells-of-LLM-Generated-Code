import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input number
        System.out.print("Input a number: ");
        int number = input.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
