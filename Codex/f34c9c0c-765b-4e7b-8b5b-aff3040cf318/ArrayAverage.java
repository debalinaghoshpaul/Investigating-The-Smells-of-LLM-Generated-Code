import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array size
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the average value of the array elements
        double average = 0;
        for (int i = 0; i < n; i++) {
            average += arr[i];
        }
        average /= n;

        // Print the average value
        System.out.println(average);
    }
}
