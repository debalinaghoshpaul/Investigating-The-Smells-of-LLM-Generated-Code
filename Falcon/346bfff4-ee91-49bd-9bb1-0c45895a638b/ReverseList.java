import java.util.*;

public class ReverseList {

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        // Test case 1: Integer list
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original list: " + integerList);
        List<Integer> reversedIntegerList = reverseList(integerList);
        System.out.println("Reversed list: " + reversedIntegerList);

        // Test case 2: String list
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println("Original list: " + stringList);
        List<String> reversedStringList = reverseList(stringList);
        System.out.println("Reversed list: " + reversedStringList);

        // Test case 3: Empty list
        List<Integer> emptyList = new ArrayList<>();
        System.out.println("Original list: " + emptyList);
        List<Integer> reversedEmptyList = reverseList(emptyList);
        System.out.println("Reversed list: " + reversedEmptyList);

        // Test case 4: List with null elements
        List<Integer> listWithNulls = Arrays.asList(1, 2, null, 4, 5);
        System.out.println("Original list: " + listWithNulls);
        List<Integer> reversedListWithNulls = reverseList(listWithNulls);
        System.out.println("Reversed list: " + reversedListWithNulls);
    }
}
