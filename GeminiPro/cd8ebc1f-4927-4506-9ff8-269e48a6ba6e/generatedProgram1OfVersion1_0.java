import java.util.ArrayList;
import java.util.List;

public class MergeAlternatingLists {

    public static <T> List<T> mergeAlternatingLists(List<T> list1, List<T> list2) {
        if (list1 == null || list1.isEmpty()) {
            return list2;
        }

        if (list2 == null || list2.isEmpty()) {
            return list1;
        }

        List<T> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(j));
            i++;
            j++;
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        // Test case 1: Non-empty lists
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        List<Integer> mergedList = mergeAlternatingLists(list1, list2);
        System.out.println("Merged list: " + mergedList);


        // Test case 2: Empty list
        List<Integer> list3 = new ArrayList<>();
        mergedList = mergeAlternatingLists(list1, list3);
        System.out.println("Merged list: " + mergedList);


        // Test case 3: Equal-length lists
        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(3);
        list4.add(5);
        mergedList = mergeAlternatingLists(list1, list4);
        System.out.println("Merged list: " + mergedList);
    }
}
