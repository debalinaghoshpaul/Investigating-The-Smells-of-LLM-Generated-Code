import java.util.Scanner;

public class LargestValueBetweenFirstAndLastElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input array
        System.out.println("Enter the array elements (separated by spaces): ");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Find the larger value between the first and last elements
        int largerValue = Math.max(arr[0], arr[arr.length - 1]);

        // Print the result
        System.out.println("Larger value between first and last element: " + largerValue);
    }
}
