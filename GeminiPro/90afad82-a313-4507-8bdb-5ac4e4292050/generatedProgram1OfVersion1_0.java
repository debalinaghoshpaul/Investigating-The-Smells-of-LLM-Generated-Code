import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Get the values for the array
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Print the sum of the array
        System.out.println("The sum of the array is: " + sum);
    }
}
