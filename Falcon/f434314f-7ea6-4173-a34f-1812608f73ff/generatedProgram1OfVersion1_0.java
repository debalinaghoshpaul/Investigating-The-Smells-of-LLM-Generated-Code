import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int target = 7;
        int index = -1;
        while (index!= -1) {
            if (arr.get(index) == target) {
                System.out.println("Element found at index: " + index);
                break;
            }
            index = (index + 1) % arr.size();
        }
        if (index == -1) {
            System.out.println("Element not found");
        }
    }
}

