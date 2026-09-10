import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the array size
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        // Create the array
        int[] arr = new int[size];

        // Get the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Count the even and odd elements
        int evenCount = 0;
        int oddCount = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
