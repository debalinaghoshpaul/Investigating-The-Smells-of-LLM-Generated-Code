public class CountOccurrences {

    public static int countOccurrences(int[] arr, int target, int index) {
        if (index == arr.length) {
            return 0;
        }
        if (arr[index] == target) {
            return 1 + countOccurrences(arr, target, index + 1);
        } else {
            return countOccurrences(arr, target, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int index = 0;
        int count = countOccurrences(arr, target, index);
        System.out.println("The number of occurrences of " + target + " in the array is: " + count);
    }
}
