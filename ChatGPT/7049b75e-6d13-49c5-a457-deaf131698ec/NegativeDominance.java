public class NegativeDominance {
    
    public static boolean checkNegativeDominance(int[] arr) {
        int negativeCount = 0;
        int positiveCount = 0;
        
        for(int num : arr) {
            if(num < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        
        return negativeCount > positiveCount;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, -2, -5, -4, 3, -6};
        
        System.out.println("Original array of numbers: [1, -2, -5, -4, 3, -6]");
        
        boolean isNegativeDominant = checkNegativeDominance(arr);
        
        if(isNegativeDominant) {
            System.out.println("Check Negative Dominance in the said array! true");
        } else {
            System.out.println("Check Negative Dominance in the said array! false");
        }
    }
}
