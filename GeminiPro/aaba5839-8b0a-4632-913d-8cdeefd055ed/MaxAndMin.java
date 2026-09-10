import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();

        // Read the elements of the array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum and minimum values of the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print the maximum and minimum values of the array
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
