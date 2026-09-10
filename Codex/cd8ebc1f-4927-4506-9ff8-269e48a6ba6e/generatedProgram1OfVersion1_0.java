import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        if (list1.size() > size) {
            mergedList.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > size) {
            mergedList.addAll(list2.subList(size, list2.size()));
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        List<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}