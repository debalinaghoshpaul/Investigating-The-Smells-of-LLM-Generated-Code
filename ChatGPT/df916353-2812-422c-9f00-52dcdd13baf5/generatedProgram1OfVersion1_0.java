
public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 8, 9};
        
        moveZerosToEnd(arr);
        
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
    
    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                if(index != i) {
                    arr[i] = 0;
                }
                index++;
            }
        }
    }

}