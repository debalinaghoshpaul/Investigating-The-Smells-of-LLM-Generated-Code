import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    result.add(list1.get(i));
                }
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}

