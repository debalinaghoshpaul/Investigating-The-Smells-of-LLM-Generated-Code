import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
            result.add(list);
        }

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

