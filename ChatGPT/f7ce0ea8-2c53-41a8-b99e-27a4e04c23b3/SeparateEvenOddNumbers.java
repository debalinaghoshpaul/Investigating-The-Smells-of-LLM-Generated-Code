import java.util.Arrays;

public class SeparateEvenOddNumbers {

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 3, 15, 12, 6, 11};

        separateEvenOdd(numbers);

        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(numbers));
    }

    public static void separateEvenOdd(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            while (numbers[left] % 2 == 0 && left < right) {
                left++;
            }

            while (numbers[right] % 2 != 0 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }
    }
}
