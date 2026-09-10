
public class MoveNumbers {

    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -1, -3, 1, 2, -4, 0};

        System.out.println("Original array: " + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] < 0 && arr[right] >= 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if (arr[left] >= 0) {
                left++;
            }
            if (arr[right] < 0) {
                right--;
            }
        }

        System.out.println("Result: " + Arrays.toString(arr));
    }
}
