public class DifferenceMinMax {
    
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 10, 5};
        
        int difference = findDifference(arr);
        
        System.out.println("The difference between the largest and smallest values in the array is: " + difference);
    }
    
    public static int findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max - min;
    }
}
