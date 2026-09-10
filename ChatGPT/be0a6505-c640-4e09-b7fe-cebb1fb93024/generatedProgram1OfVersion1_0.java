import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5, 6 };
        shuffleArray(nums);
    }

    public static void shuffleArray(Integer[] nums) {
        List<Integer> list = Arrays.asList(nums);
        Collections.shuffle(list);
        System.out.println("Shuffle Array: " + list);
    }
}
