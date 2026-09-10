public class ArraySum {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        
        int sum = sumArrayValues(array);
        
        System.out.println("Sum of array values: " + sum);
    }
    
    public static int sumArrayValues(int[] array) {
        int sum = 0;
        
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        
        return sum;
    }
}
