public class RearrangeOddEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rearrangeOddEven(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rearrangeOddEven(int[] arr) {
        int oddIndex = 0;
        int evenIndex = arr.length - 1;

        while (oddIndex < evenIndex) {
            while (arr[oddIndex] % 2 != 0) {
                oddIndex++;
            }
            while (arr[evenIndex] % 2 == 0) {
                evenIndex--;
            }
            if (oddIndex < evenIndex) {
                int temp = arr[oddIndex];
                arr[oddIndex] = arr[evenIndex];
                arr[evenIndex] = temp;
                oddIndex++;
                evenIndex--;
            }
        }
    }
}
