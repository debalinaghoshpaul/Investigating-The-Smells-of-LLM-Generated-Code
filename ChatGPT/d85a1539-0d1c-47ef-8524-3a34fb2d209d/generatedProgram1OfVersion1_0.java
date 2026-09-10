
public class IntegerDifference {

    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 3, 5, 6, 6, 8};
        
        int minNum = findMinNumber(numbers);
        int maxNum = findMaxNumber(numbers);
        
        int difference = maxNum - minNum;
        
        System.out.println("The minimum number is: " + minNum);
        System.out.println("The maximum number is: " + maxNum);
        System.out.println("The difference between the largest and smallest number is: " + difference);
    }
    
    public static int findMinNumber(int[] numbers) {
        Arrays.sort(numbers);
        int minNum = 0;
        int multiplier = 1;
        
        for(int i=0; i<numbers.length; i++) {
            minNum += numbers[i] * multiplier;
            multiplier *= 10;
        }
        
        return minNum;
    }
    
    public static int findMaxNumber(int[] numbers) {
        Arrays.sort(numbers);
        int maxNum = 0;
        int multiplier = 1;
        
        for(int i=numbers.length-1; i>=0; i--) {
            maxNum += numbers[i] * multiplier;
            multiplier *= 10;
        }
        
        return maxNum;
    }

}