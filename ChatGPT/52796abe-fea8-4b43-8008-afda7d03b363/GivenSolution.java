import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 3, 9, 1};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println( Arrays.toString(array));
    }
}
