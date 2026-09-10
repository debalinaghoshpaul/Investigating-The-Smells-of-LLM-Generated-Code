import java.util.*;

public class ArrayWithoutZeroAndMinusOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();

        // Create an array of integers
        int[] array = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array contains 0 or -1
        boolean containsZeroOrMinusOne = false;
        for (int element : array) {
            if (element == 0 || element == -1) {
                containsZeroOrMinusOne = true;
                break;
            }
        }

        // Print the result
        if (containsZeroOrMinusOne) {
            System.out.println("Array contains 0 or -1");
        } else {
            System.out.println("Array without 0 and -1");
        }
    }
}
