import java.util.Scanner;

public class AlternatePositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Get the elements of the array
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array alternates between positive and negative values
        boolean alternates = true;
        for (int i = 1; i < size; i++) {
            if ((arr[i] >= 0 && arr[i - 1] >= 0) || (arr[i] < 0 && arr[i - 1] < 0)) {
                alternates = false;
                break;
            }
        }

        // Print the result
        if (alternates) {
            System.out.println("The array alternates between positive and negative values.");
        } else {
            System.out.println("The array does not alternate between positive and negative values.");
        }
    }
}
