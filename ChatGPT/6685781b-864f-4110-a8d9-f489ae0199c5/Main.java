public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 8, 2, 7, 2};
        int target = 2;

        int count = countOccurrences(arr, target, 0);
        System.out.println("Number of occurrences of " + target + " in the array: " + count);
    }

    public static int countOccurrences(int[] arr, int target, int index) {
        if(index == arr.length) {
            return 0;
        } else {
            int count = countOccurrences(arr, target, index + 1);
            if(arr[index] == target) {
                return count + 1;
            } else {
                return count;
            }
        }
    }
}
