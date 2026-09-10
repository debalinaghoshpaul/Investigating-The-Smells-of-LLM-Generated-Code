import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public static void findPairs(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("(" + arr[i] + ", " + complement + ")");
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 7, 8, 9};
        int targetSum = 12;
        
        findPairs(arr, targetSum);
    }
}
