import java.util.*;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int[] updatedArr = removeDuplicateElements(arr);
        System.out.println("Updated array: " + Arrays.toString(updatedArr));
        System.out.println("New length of the array: " + updatedArr.length);
    }

    public static int[] removeDuplicateElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] updatedArr = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            updatedArr[index++] = num;
        }
        return updatedArr;
    }
}
