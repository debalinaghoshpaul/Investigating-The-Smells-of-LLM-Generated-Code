
public class ContinuousSubarraySum {

    public static int findContinuousSubarrays(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2};
        int target = 3;

        int result = findContinuousSubarrays(arr, target);
        System.out.println("Total number of continuous subarrays with sum " + target + ": " + result);
    }
}
