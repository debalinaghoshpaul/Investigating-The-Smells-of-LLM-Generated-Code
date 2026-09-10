import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                list.remove(arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(removeDuplicates(arr));
    }
}

// 