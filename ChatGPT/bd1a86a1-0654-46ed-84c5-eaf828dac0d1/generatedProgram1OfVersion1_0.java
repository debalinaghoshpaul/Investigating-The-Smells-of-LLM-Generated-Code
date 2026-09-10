import java.util.*;

public class ArraySum {
    
    public static void findPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            
            if (set.contains(complement)) {
                System.out.println("Pair found: " + num + ", " + complement);
                return;
            }
            
            set.add(num);
        }
        
        System.out.println("Pair not found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;
        
        findPair(arr, target);
    }
}
