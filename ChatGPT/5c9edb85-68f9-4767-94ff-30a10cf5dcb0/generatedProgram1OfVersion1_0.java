
public class EvenOddPartition {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] result = partitionEvenOdd(arr);
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even-Odd Partition: " + Arrays.toString(result));
    }
    
    public static int[] partitionEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = evenCount;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[evenIndex] = arr[i];
                evenIndex++;
            } else {
                result[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        
        return result;
    }
}
