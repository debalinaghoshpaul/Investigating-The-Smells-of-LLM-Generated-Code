public class LeadersInArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n-1];
        
        System.out.println("Leaders in the array: ");
        System.out.print(maxRight + " ");
        
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > maxRight) {
                System.out.print(arr[i] + " ");
                maxRight = arr[i];
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}
