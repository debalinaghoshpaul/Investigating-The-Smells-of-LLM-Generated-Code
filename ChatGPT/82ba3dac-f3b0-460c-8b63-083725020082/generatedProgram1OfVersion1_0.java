public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        
        double sum = 0;
        for(int num : arr) {
            sum += num;
        }
        
        double average = sum / arr.length;
        
        System.out.print("Original Array: [");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("The average of the said array is: " + average);
        
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for(int num : arr) {
            if(num > average) {
                System.out.print(num + " ");
            }
        }
    }
}
