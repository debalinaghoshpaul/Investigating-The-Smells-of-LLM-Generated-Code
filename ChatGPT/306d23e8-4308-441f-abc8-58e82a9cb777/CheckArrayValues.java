public class CheckArrayValues {

    public static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {0, 2, 3, 4};
        int[] arr3 = {-1, 2, 3, 4};
        
        if (checkArray(arr1)) {
            System.out.println("arr1 does not contain 0 or -1");
        } else {
            System.out.println("arr1 contains 0 or -1");
        }
        
        if (checkArray(arr2)) {
            System.out.println("arr2 does not contain 0 or -1");
        } else {
            System.out.println("arr2 contains 0 or -1");
        }
        
        if (checkArray(arr3)) {
            System.out.println("arr3 does not contain 0 or -1");
        } else {
            System.out.println("arr3 contains 0 or -1");
        }
    }
}
