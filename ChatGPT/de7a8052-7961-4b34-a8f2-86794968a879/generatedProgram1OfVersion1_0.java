import java.util.Scanner;

public class TestIf10AppearsAsFirstOrLastElementOfAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        boolean result = false;

        if (size >= 2) {
            result = array[0] == 10 || array[size - 1] == 10;
        }

        System.out.println(result);
    }
}
