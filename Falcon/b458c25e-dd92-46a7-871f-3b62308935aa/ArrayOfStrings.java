import java.util.Scanner;

public class ArrayOfStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create an array of strings
        String[] array = new String[size];

        // Populate the array with values 0, 1, 2, ..., n-1
        for (int i = 0; i < size; i++) {
            array[i] = Integer.toString(i);
        }

        // Print the array
        System.out.println("The array is: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
