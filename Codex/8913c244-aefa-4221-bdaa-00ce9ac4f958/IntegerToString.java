import java.util.Scanner;

public class IntegerToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        // Convert the integer to a string using the String.valueOf() method
        String stringNumber = String.valueOf(number);

        // Print the string format of the integer
        System.out.println("String format of the said integer: " + stringNumber);
    }
}
