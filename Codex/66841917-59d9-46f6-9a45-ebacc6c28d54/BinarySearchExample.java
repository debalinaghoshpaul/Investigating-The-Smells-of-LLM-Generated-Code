public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 65, 78, 90, 98};
        int numberToSearch = 78;
        
        if (findNumber(arr, numberToSearch)) {
            System.out.println("Number found in array");
        } else {
            System.out.println("Number not found in array");
        }
    }
    
    public static boolean findNumber(int[] arr, int number) {
        return binarySearch(arr, number, 0, arr.length - 1);
    }
    
    private static boolean binarySearch(int[] arr, int number, int low, int high) {
        if (low > high) {
            return false;
        }
        
        int mid = (low + high) / 2;
        
        if (arr[mid] == number) {
            return true;
        } else if (arr[mid] > number) {
            return binarySearch(arr, number, low, mid - 1);
        } else {
            return binarySearch(arr, number, mid + 1, high);
        }
    }
}
