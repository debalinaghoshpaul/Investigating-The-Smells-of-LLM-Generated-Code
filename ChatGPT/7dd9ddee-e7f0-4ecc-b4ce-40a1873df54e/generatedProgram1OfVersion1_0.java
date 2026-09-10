
public class LongestConsecutiveSequence {
    
    public static int longestConsecutiveSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int longestSeq = 0;
        
        for(int num : nums) {
            if(!set.contains(num-1)) {
                int currNum = num;
                int currSeq = 1;
                
                while(set.contains(currNum+1)) {
                    currNum++;
                    currSeq++;
                }
                
                longestSeq = Math.max(longestSeq, currSeq);
            }
        }
        
        return longestSeq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutiveSequence(nums)); // Output should be 7
    }
}