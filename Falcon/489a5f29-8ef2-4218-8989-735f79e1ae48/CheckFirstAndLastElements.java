import java.util.Scanner;

public class CheckFirstAndLastElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array from the user
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array length is greater than or equal to 2
        if (array.length < 2) {
            System.out.println("The array length must be greater than or equal to 2.");
            return;
        }

        // Check if the first and last elements of the array are the same
        boolean firstAndLastElementsAreEqual = array[0] == array[array.length - 1];

        // Print the result
        System.out.println(firstAndLastElementsAreEqual);
    }
}
