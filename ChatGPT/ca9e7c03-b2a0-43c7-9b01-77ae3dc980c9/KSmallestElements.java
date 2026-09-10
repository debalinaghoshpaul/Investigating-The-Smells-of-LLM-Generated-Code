
public class KSmallestElements {

    public static void main(String[] args) {
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        Arrays.sort(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.print(k + " smallest elements of the said array are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
