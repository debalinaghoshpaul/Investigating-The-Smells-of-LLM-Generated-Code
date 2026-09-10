
public class SeparateEvenAndOddNumbers {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 9, 6, 4, 7};

        separateEvenAndOddNumbers(numbers);

        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(numbers));
    }

    public static void separateEvenAndOddNumbers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
