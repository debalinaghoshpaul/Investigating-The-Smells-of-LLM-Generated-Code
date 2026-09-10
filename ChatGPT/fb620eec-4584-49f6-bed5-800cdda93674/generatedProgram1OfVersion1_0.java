import java.util.HashMap;

public class FindDuplicateInArray {
    
    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        
        for(int num : arr) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                found = true;
            } else {
                map.put(num, 1);
            }
        }
        
        if(!found) {
            System.out.println("No duplicates found in the array.");
            return;
        }
        
        System.out.println("Duplicate values in the array are : ");
        for(Integer key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 4, 1};
        
        findDuplicates(arr);
    }
}
