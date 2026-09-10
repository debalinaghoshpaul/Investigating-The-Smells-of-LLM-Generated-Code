import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static <T> List<T> reverse(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        int start = 0;
        int end = reversedList.size() - 1;

        while (start < end) {
            T temp = reversedList.get(start);
            reversedList.set(start, reversedList.get(end));
            reversedList.set(end, temp);
            start++;
            end--;
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> reversedNumbers = reverse(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Reversed List: " + reversedNumbers);
    }
}
