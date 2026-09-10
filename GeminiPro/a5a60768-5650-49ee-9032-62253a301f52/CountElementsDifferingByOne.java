import java.util.Scanner;

public class CountElementsDifferingByOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = input.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = input.nextInt();
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Math.abs(arr1[i] - arr2[i]) <= 1) {
                count++;
            }
        }

        System.out.println("The number of elements that differ by 1 or less between the two arrays is: " + count);
    }
}
