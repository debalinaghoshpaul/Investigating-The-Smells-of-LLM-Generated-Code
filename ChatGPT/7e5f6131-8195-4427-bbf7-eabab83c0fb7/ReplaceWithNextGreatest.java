public class ReplaceWithNextGreatest {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        replaceWithNextGreatest(arr);
        printArray(arr);
    }

    public static void replaceWithNextGreatest(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        
        for (int i = arr.length-2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
