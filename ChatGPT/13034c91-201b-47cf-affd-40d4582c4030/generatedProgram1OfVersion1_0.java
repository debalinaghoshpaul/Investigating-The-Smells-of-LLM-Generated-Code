import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplets {

    public static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            if(i == 0 || (i > 0 && arr[i] != arr[i-1])) {
                int left = i+1;
                int right = arr.length - 1;
                int sum = target - arr[i];

                while (left < right) {
                    if (arr[left] + arr[right] == sum) {
                        triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));

                        while (left < right && arr[left] == arr[left + 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (arr[left] + arr[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;
        findTriplets(arr, target);
    }
}
