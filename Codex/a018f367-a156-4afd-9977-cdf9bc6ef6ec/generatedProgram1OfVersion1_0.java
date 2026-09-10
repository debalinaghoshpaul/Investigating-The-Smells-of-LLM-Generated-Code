import java.util.Scanner;

public class Contains10or30 {

    public static boolean contains10or30(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10 || arr[i] == 30) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        if (contains10or30(arr)) {
            System.out.println("The array contains 10 or 30.");
        } else {
            System.out.println("The array does not contain 10 or 30.");
        }
    }
}
