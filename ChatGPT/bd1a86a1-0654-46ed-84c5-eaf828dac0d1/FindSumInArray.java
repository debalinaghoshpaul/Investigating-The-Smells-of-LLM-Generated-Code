import java.util.HashMap;

public class FindSumInArray {
    public static void findSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found at index " + map.get(complement) + " and " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Pair not found");
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;
        
        findSum(arr, target);
    }
}
