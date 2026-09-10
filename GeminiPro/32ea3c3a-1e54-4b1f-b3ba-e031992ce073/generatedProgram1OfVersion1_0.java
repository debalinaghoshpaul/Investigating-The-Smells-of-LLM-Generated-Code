import java.util.Scanner;

public class MultiplyArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the size of the arrays
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();

        // Create the arrays
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        // Get the elements of the arrays
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        // Multiply the corresponding elements of the arrays
        int[] result = new int[size1];
        for (int i = 0; i < size1; i++) {
            result[i] = array1[i] * array2[i];
        }

        // Print the result
        System.out.println("Result: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
