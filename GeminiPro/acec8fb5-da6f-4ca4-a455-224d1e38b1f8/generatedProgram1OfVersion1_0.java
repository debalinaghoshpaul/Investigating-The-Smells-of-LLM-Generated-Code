import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number to generate the multiplication table for
        System.out.println("Input the number (Table to be calculated) : ");
        int number = scanner.nextInt();

        // Get the number of terms to generate in the multiplication table
        System.out.println("Input number of terms : ");
        int terms = scanner.nextInt();

        // Generate and display the multiplication table
        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
