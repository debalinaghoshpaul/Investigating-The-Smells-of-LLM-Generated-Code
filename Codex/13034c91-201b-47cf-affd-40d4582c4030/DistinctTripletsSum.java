import java.util.Arrays;

public class DistinctTripletsSum {

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;
        findDistinctTriplets(arr, target);
    }

    public static void findDistinctTriplets(int[] arr, int target) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Iterate over the array and consider each element as the first element of the triplet
        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Set the left and right pointers to the elements adjacent to the first element
            int left = i + 1;
            int right = arr.length - 1;

            // Iterate until the left and right pointers cross
            while (left < right) {
                // Check if the sum of the three elements is equal to the target
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    // Print the triplet
                    System.out.println("[" + arr[i] + ", " + arr[left] + ", " + arr[right] + "]");

                    // Skip duplicate elements
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    // Move the left and right pointers towards each other
                    left++;
                    right--;
                } else if (sum < target) {
                    // Move the left pointer towards the right to increase the sum
                    left++;
                } else {
                    // Move the right pointer towards the left to decrease the sum
                    right--;
                }
            }
        }
    }
}
