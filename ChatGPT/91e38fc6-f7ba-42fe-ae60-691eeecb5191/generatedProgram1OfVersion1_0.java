
public class RotationCount {

    public static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            if (arr[start] <= arr[end]) {
                return start;
            }
            
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int rotationCount = findRotationCount(arr);
        System.out.println("The array is rotated " + rotationCount + " times.");
        
        sc.close();
    }
}