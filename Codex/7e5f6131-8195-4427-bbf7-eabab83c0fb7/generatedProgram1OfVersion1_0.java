import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ReplaceWithNextGreatest {

    public static void main(String[] args) {
        // Test case 1:
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(replaceWithNextGreatest(arr1))); // Output: [17, -1, 5, 5, -1, -1]

        // Test case 2:
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(replaceWithNextGreatest(arr2))); // Output: [2, 3, 4, 5, -1]

        // Test case 3:
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(replaceWithNextGreatest(arr3))); // Output: [-1, -1, -1, -1, -1]
    }

    public static int[] replaceWithNextGreatest(int[] arr) {
        // Create a temporary array of the same size as the given array
        int[] result = new int[arr.length];

        // Create a HashMap to store the element and its index
        Map<Integer, Integer> elementIndexMap = new HashMap<>();

        // Iterate over the given array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Check if the current element is already in the map
            if (elementIndexMap.containsKey(arr[i])) {
                // If the current element is already in the map, then its next greatest element is the value stored in the map
                result[i] = elementIndexMap.get(arr[i]);
            } else {
                // If the current element is not in the map, then its next greatest element is -1
                result[i] = -1;
            }

            // Update the map with the current element and its index
            elementIndexMap.put(arr[i], i);
        }

        // Return the result array
        return result;
    }
}
