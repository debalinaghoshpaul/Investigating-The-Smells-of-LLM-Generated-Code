import java.util.HashSet;

public class AbsoluteDistinctCount {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 2, 4, -3, 1, 5, 6, 1 };
        int count = countDistinct(arr);
        System.out.println("The number of absolute distinct values in the array is: " + count);
    }

    public static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(Math.abs(num));
        }
        return set.size();
    }
}