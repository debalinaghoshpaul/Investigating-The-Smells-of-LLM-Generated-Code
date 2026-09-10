import java.util.HashSet;

public class LongestConsecutiveSequence {
    
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int maxLength = 0;
        
        for(int num : set) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while(set.contains(currentNum+1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        
        int result = longestConsecutive(arr);
        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
