import java.util.Scanner;

public class CheckAdjacentNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the specified number: ");
        int num = input.nextInt();

        boolean found = false;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == num && arr[i + 1] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The specified number appears in every pair of adjacent integers of the given array.");
        } else {
            System.out.println("The specified number does not appear in every pair of adjacent integers of the given array.");
        }
    }
}
