public class SumOfOddNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumOfOddNumbers(numbers);
        System.out.println("Sum of all odd numbers in the array: " + sum);
    }

    public static int sumOfOddNumbers(int[] arr) {
        return sumOfOddNumbersHelper(arr, 0);
    }

    private static int sumOfOddNumbersHelper(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        
        if (arr[index] % 2 != 0) {
            return arr[index] + sumOfOddNumbersHelper(arr, index + 1);
        } else {
            return sumOfOddNumbersHelper(arr, index + 1);
        }
    }
}
