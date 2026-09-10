import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 7, 9, 13, 40);
        List<Integer> list2 = Arrays.asList(1, 4, 6, 7, 6, 2);

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println(mergedList);
    }
}

// 