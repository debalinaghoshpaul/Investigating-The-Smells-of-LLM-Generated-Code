import java.util.*;

public class FindPairsWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 15;

        findPairsWithGivenSum(arr, sum);
    }

    public static void findPairsWithGivenSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];

            if (set.contains(complement)) {
                System.out.println("Pair found: " + arr[i] + " + " + complement + " = " + sum);
            }

            set.add(arr[i]);
        }
    }
}
